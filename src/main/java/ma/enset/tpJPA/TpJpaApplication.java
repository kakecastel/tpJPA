package ma.enset.tpJPA;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import ma.enset.tpJPA.entities.Patient;
import ma.enset.tpJPA.repositories.PatientRepository;

@SpringBootApplication
public class TpJpaApplication implements CommandLineRunner {
@Autowired
private	PatientRepository patientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TpJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		patientRepository.save(new Patient(null,"william",new Date(),2300,false));
		patientRepository.save(new Patient(null,"castel",new Date(),2500,false));
		patientRepository.save(new Patient(null,"tchendje",new Date(),3000,false));
		patientRepository.save(new Patient(null,"kountchou",new Date(),3500,false));
		patientRepository.save(new Patient(null,"midrel",new Date(),4000,true));
		System.out.println("***********************************************");
		patientRepository.findAll().forEach(p-> System.out.println(p.toString()));
		Optional<Patient> p=patientRepository.findById(2L);
		System.out.println("***********************************************");
		System.out.println("**	"+p.isPresent());
		//-----traitement des resultats avec pagination
		System.out.println("***********************************************");
		Page<Patient> patienPage=patientRepository.findByNameContains("a", PageRequest.of(0, 2));
			patienPage.getContent().forEach(
					page-> 
					System.out.println("danas la page 	"+page.toString()));
					
	}

}
