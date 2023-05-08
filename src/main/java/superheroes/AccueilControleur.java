package superheroes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilControleur {
   
    @GetMapping("/")
    public String Accueil(){
        return "Accueil";// ici le return est comme un redirect http
    }
        
    @GetMapping("/Incident")
    public String Incident(){
        return "Incident";
    } 
}
