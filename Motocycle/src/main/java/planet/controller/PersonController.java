package planet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import planet.dto.PersoanaDTO;
import planet.service.PersonService;

@RestController
public class PersonController extends BaseRestController {

    //TODO Add validator in Persoana Entity

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/person/{id}", produces = "application/json")
    public PersoanaDTO getPersonById(@PathVariable Integer id) {
        PersoanaDTO personById = personService.getPersonById(id);
        if (personById == null) {
            return new PersoanaDTO();
        }

        return personById;
    }

    @PostMapping(value = "/person",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<PersoanaDTO> createPerson(@RequestBody PersoanaDTO persoanaDTO) {
        if (persoanaDTO != null) {
            PersoanaDTO savedPerson = personService.savePerson(persoanaDTO);
            return new ResponseEntity<>(savedPerson, HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping(value = "/person/{id}")
    public ResponseEntity<?> deletePersonById(@PathVariable Integer id) {
        if (id != null && personService.deletePerson(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/persons")
    public ResponseEntity<List<PersoanaDTO>> getAllPersons() {
        List<PersoanaDTO> allPersons= personService.findAllPersons();
        if (allPersons.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(allPersons, HttpStatus.OK);
    }
}