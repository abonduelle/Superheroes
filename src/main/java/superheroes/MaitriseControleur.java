package superheroes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        List<TypeIncident> typeIncidents = repository2.findAll();
        model.addAttribute("typeIncidents", typeIncidents);
        return "Maitrise";
    }
    String displaySuperHero (Model model) {
    List<SuperHero> superHeros = repository.findById(4);
    model.addAttribute("superHeros", superHeros);
    return "Maitrise";
    }



}
