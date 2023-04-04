package ma.enset.tpJPA.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.enset.tpJPA.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
	public Optional<Patient> findById(Long l);
	//-----ecrire une methode avec la norme spring Data
	//----norme ----findBy_nom-de-attribut_traitement
	public List<Patient> findByNameContains(String name);
	
	public List<Patient> findByMalade(boolean l);
	
	public List<Patient> findByNameContainsAndMalade(String name,boolean l);
	
	//---notion de pagination avec spring data pageable
	
	//----cherche les patients avec le nom name et avec la page suivante 
	public Page<Patient> findByNameContains(String name,Pageable pageable);
	
	
}
