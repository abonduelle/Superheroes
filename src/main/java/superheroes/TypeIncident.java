package superheroes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class TypeIncident {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column @NotNull @NotBlank
    private String nom;

    public String getNom() {
        return nom;
    }

    //public void setNom(String nom) {
       // this.nom = nom;
    //}
    @OneToMany(mappedBy = "typeIncident")
    List<SuperHeroTypeIncident> superHeroTypeIncidents;

    public TypeIncident() {
        
    }

    public TypeIncident(Long id, @NotNull @NotBlank String nom, List<SuperHeroTypeIncident> superHeroTypeIncidents) {
        this.id = id;
        this.nom = nom;
        this.superHeroTypeIncidents = superHeroTypeIncidents;
    }

}
