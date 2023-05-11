package superheroes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.Id;

@Controller
public class MaitriseControleur {
    
    @Autowired
    SuperHeroRepository repository;

    @Autowired
    TypeIncidentRepository repository2;

    @Autowired
    SuperHeroTypeIncidentRepository repository3;

    @GetMapping("/Maitrise")
    String displayTypeIncidents (Model model) {
        SuperHero superHero = repository.findById(4);
        model.addAttribute("superHero", superHero);
        System.out.println(superHero.getNom());
        List<TypeIncident> typeIncidents = repository2.findAll();
        model.addAttribute("typeIncidents", typeIncidents);
        System.out.println(typeIncidents);
        return "Maitrise";
    }
    //void displaySuperHero (Model model) {
        //displaySuperHero(model);
       
    //}



}
