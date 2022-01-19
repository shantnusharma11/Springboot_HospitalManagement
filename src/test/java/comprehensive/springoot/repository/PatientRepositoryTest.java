package comprehensive.springoot.repository;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import comprehensive.springoot.Entity.Patient;
import comprehensive.springoot.Repository.PatientRepository;

@SpringBootTest
public class PatientRepositoryTest {

	@Autowired
	private PatientRepository patientRepository;
	
	@Test
	public void savePatientTest() {
	Patient patient= Patient.builder()
			   .patientAge(32)
			   .patientName("Aman")
			   .doctorPrescription("Rest")
			   .build();
	
	patientRepository.save(patient);
	Assertions.assertThat(patient.getPatientId()).isGreaterThan(0);
	}
	
	/*
	 * @Test public void getPatientByIdTest() { Patient patient=
	 * patientRepository.findById((long) 1).get();
	 * Assertions.assertThat(patient.getPatientId()).isEqualTo(1); }
	 */
	@Test
	public void getAllPatientsTest() {
		List<Patient> patient= patientRepository.findAll();
		Assertions.assertThat(patient.size()).isGreaterThan(0);
	}
	
}
