package superheroes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class SuperHeroTypeIncident{
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Min(1)
    @Max(3)
    @Column @NotNull
    int niveau;

    public SuperHeroTypeIncident(Long id, @Min(1) @Max(3) int niveau, SuperHero superHero, TypeIncident typeIncident) {
        this.id = id;
        this.niveau = niveau;
        this.superHero = superHero;
        this.typeIncident = typeIncident;
    }
    @ManyToOne
    SuperHero superHero;

    @ManyToOne
    TypeIncident typeIncident;
    
    public int getLevel() {
        return niveau;
    }
    public void setLevel(int niveau) {
        this.niveau = niveau;
    }
}
