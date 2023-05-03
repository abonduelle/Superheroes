package superheroes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
