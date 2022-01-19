package comprehensive.springoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import comprehensive.springoot.Entity.Doctor;
import comprehensive.springoot.Entity.Patient;
import comprehensive.springoot.dto.DoctorNameResponse;
//import comprehensive.springoot.dto.ShowPatientInfo;

@Service
public interface ComprehensiveService {

	public Doctor saveDoctor(Doctor docter);

	public List<Doctor> getAllDoctors();
	
	public Patient savePatient(Patient patient);
	
	public List<Patient> getAllPatients();
	
	public Doctor getDoctorById(Long DoctorId);
	
	public Patient getPatientById(Long PatientId);
	
	public Doctor getDoctorByName(String doctorName);
	
	public List<DoctorNameResponse> getAllDoctorsName();

    //public List<ShowPatientInfo> getInfoPatient();
}
