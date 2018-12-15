package planet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import planet.dto.PersoanaDTO;
import planet.entity.Persoana;
import planet.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;



    public PersoanaDTO savePerson(PersoanaDTO persoanaDTO) {
        Persoana persoana = new Persoana();
        persoana.setNume(persoanaDTO.getNume());



        Persoana save = personRepository.save(persoana);


        return new PersoanaDTO(save.getId(), save.getNume(), save.getNrTelefon(),
                save.getMail(), save.getUsername(), save.getPassword());
    }

    public List<PersoanaDTO> findAllPersons() {
        Iterable<Persoana> all = personRepository.findAll();
        List<PersoanaDTO> persoanaDTOS = new ArrayList<>();

        for (Persoana p : all) {
            persoanaDTOS.add(new PersoanaDTO(
                    p.getId(), p.getNume(),p.getNrTelefon(),p.getMail(),
           p.getUsername(),p.getPassword() ));
        }

        return persoanaDTOS;
    }

    public PersoanaDTO getPersonById(Integer id) {
        Optional<Persoana> personOptional = personRepository.findById(id);
        if (personOptional.isPresent()) {
            Persoana persoana = personOptional.get();


            return new PersoanaDTO(
                    persoana.getId(), persoana.getNume(), persoana.getNrTelefon(),
                    persoana.getMail(),persoana.getUsername(),persoana.getPassword());
        }

        return null;
    }

    public boolean deletePerson(Integer id) {
        boolean personExists = personRepository.existsById(id);
        if (personExists) {
            personRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
