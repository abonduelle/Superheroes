package superheroes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHeroTypeIncidentRepository extends JpaRepository<SuperHeroTypeIncident, Long>{
    List<SuperHeroTypeIncident> findSuperHeroTypeIncidentBySuperHeroId (int id);
    SuperHeroTypeIncidentRepository save(Long id);

    //@Query(value = "SELECT (d.niveau, e.nom) " + "FROM super_hero_type_incident d LEFT JOIN type_incident e " + "WHERE d.super_hero_id = :SuperHeroId", nativeQuery = true)
    //public Iterable<SuperHeroTypeIncident> findBySuperHeroId(@Param("SuperHeroId") int id);
    @Query(value = "SELECT d.super_hero_id, d.type_incident_id, d.niveau, e.nom, e.id FROM super_hero_type_incident d LEFT JOIN type_incident e ON d.type_incident_id = e.id WHERE d.super_hero_id = 4", nativeQuery = true)
    public Iterable<SuperHeroTypeIncident> findBySuperHeroId(@Param("SuperHeroId") int id);
    
}