package superheroes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroTypeIncidentRepository extends JpaRepository<SuperHeroTypeIncident, Long>{
    List<SuperHeroTypeIncident> findSuperHeroTypeIncidentById (Long id);
    SuperHeroTypeIncidentRepository save(Long id);
}
