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

import comprehensive.springoot.Entity.Doctor;
import comprehensive.springoot.Repository.DoctorRepository;

@SpringBootTest
public class DoctorRepositoryTest {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Test
	@Order(1)
	public void savedoctorTest() {
		Doctor doctor = Doctor.builder()
				.doctorName("Shantnu")
				.doctorAge(22)
				.doctorGender("Male")
				.specialistField("Surgeon")
				.build();
		doctorRepository.save(doctor);
		
		Assertions.assertThat(doctor.getDoctorId()).isGreaterThan(0);
	}
	//@Test
	/*
	 * @Order(2) public void getDoctorByIdTest() {
	 * 
	 * Doctor doctor = doctorRepository.findById((long) 1).get();
	 * 
	 * Assertions.assertThat(doctor.getDoctorId()).isEqualTo(1); }
	 */
	
	@Test
	@Order(2)
	public void getAllDoctorTest() {
List<Doctor> doctor= doctorRepository.findAll();
Assertions.assertThat(doctor.size()).isGreaterThan(0);
	}
	
}
