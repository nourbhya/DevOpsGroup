package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Entreprise;

public interface EntrepriseRepository extends CrudRepository<Entreprise, Integer>  {
    //@Modifying
    // @Transactional
    //@Query("DELETE from Departement e where e.id =:depId")
    // public void deleteDepartementById(int depId);
    @Query("select e from Entreprise e where e.name=:nom")
    public Entreprise findByName(String nom);
	
}
