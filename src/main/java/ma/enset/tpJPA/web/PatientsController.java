package ma.enset.tpJPA.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.enset.tpJPA.entities.Patient;
import ma.enset.tpJPA.repositories.PatientRepository;

@RestController
public class PatientsController {
	@Autowired
	private	PatientRepository patientRepository;
	@GetMapping("/patson")
    public List<Patient> patientall(){
    	return patientRepository.findAll();
    }
}
