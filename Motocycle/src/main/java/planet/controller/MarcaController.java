package planet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import planet.service.MarcaService;

@Controller
public class MarcaController extends BaseViewController {

    @Autowired
    MarcaService marcaService;

    @RequestMapping(value = "/marca")
    public String getMarci(Model model){

        model.addAttribute("marci", marcaService.findAllMarcs());

        return "marca_list";
    }

}
