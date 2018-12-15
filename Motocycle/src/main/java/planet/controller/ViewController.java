package planet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import planet.dto.PersoanaDTO;
import planet.service.PersonService;

@Controller
public class ViewController extends BaseViewController {

    @Autowired
    private PersonService personService;


    @GetMapping(value = "/persons")
    public String persons(Model model) {
        List<PersoanaDTO> allPersons = personService.findAllPersons();

        model.addAttribute("persons", allPersons);

        return "person";
    }

}