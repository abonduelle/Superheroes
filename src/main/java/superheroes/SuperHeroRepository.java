package superheroes;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Id;

@Repository
public interface SuperHeroRepository extends JpaRepository<SuperHero, Long>{
    List<SuperHero> findByNom(String nom);
    SuperHeroRepository save(Long Id);
    SuperHero findById(int id);
}
