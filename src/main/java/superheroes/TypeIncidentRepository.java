package superheroes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeIncidentRepository extends JpaRepository<TypeIncident, Long>{
    List<TypeIncident> findByNom(String nom);
}
