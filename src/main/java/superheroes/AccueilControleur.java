package superheroes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccueilControleur {
    @Autowired
    SuperHeroRepository repository;

    @Autowired
    TypeIncidentRepository repository2;

    @GetMapping("/")
    public String Accueil(){
        return "Accueil";// ici le return est comme un redirect http
    }

    //@GetMapping("/SuperHero")
    //public String SuperHero(){
     //   return "SuperHero";
    //}

    @GetMapping("/SuperHero")
        String displayTypeIncidents2 (Model model) {
        List<TypeIncident> typeIncidents = repository2.findAll();
        model.addAttribute("typeIncidents", typeIncidents);
        return "SuperHero";
        }
        
    @GetMapping("/Incident")
    public String Incident(){
        return "Incident";
    } 

    @PostMapping("/AjouteSuperHero")
    String AjouteSuperHero(String nom, String ville, String numeroTel, int longitude, int latitude,
        String logIn, String motDePasse,  Model model) {
        System.out.println(nom + numeroTel + ville + longitude + latitude + logIn + motDePasse);
        SuperHero superHero = new SuperHero();
        superHero.setNom(nom);
        superHero.setVille(ville);
        superHero.setNumeroTel(numeroTel);
        superHero.setLatitude(latitude);
        superHero.setLongitude(longitude);
        superHero.setLogIn(logIn);
        superHero.setMotDePasse(motDePasse);
        repository.save(superHero);
        return "AjouteSuperHero";
        }

    //@GetMapping("/SuperHero")
    //String displayTypeIncidents (Model model) {
    //    List<TypeIncident> typeIncidents = repository2.findAll();
     //   model.addAttribute("typeIncidents", typeIncidents);
    //    return "SuperHero";
    //}


}
