package comprehensive.springoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comprehensive.springoot.Entity.Doctor;
import comprehensive.springoot.Entity.Patient;
import comprehensive.springoot.dto.DoctorNameResponse;
import comprehensive.springoot.dto.ShowPatientInfo;
import comprehensive.springoot.service.ComprehensiveService;
//@Controller
@CrossOrigin
@RestController
@RequestMapping(path="/milestone")
public class ComprehensiveController {

	@Autowired
	private ComprehensiveService comprehensiveService;

	public ComprehensiveController(ComprehensiveService comprehensiveService) {
		super();
		this.comprehensiveService = comprehensiveService;
	}
	
	@PostMapping(path="/addDoctor")
	public Doctor saveDoctor(@RequestBody Doctor docter) {
		return comprehensiveService.saveDoctor(docter);
	}
	
	@PostMapping(path="/addPatient")
	public Patient savePatient(@RequestBody Patient patient) {
		return comprehensiveService.savePatient(patient);
	}
	
	@GetMapping(path="/getDoctors")
	public List<Doctor> getAllDoctors(){
		return comprehensiveService.getAllDoctors();
	}
	
	@GetMapping(path="/getPatients")
	public List<Patient> getallPatients(){
		return comprehensiveService.getAllPatients();
	}
	
	@GetMapping(path="/getDoctorById/{id}")
	public Doctor getDoctorById(@PathVariable("id")Long doctorId) {
		return comprehensiveService.getDoctorById(doctorId);
	}
	
	@GetMapping(path="/getPatientById/{id}")
	public Patient getPatientById(@PathVariable("id") Long patientId) {
		return comprehensiveService.getPatientById(patientId);
	}
	
	@GetMapping(path="/getDoctorByName/{name}")
	public Doctor getDoctorByName(@PathVariable("name") String doctorName) {
		return comprehensiveService.getDoctorByName(doctorName);
	}
		
	@GetMapping(path="/getAllNames")
	public List<DoctorNameResponse> getAllDoctorName() {
		return comprehensiveService.getAllDoctorsName();
	}
	
	/*
	 * @GetMapping(path="/getPatientInfo") public List<ShowPatientInfo>
	 * getInfoPatient(){ return comprehensiveService.getInfoPatient(); }
	 */
}
