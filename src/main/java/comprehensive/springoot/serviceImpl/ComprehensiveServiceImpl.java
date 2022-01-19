package comprehensive.springoot.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comprehensive.springoot.Entity.Doctor;
import comprehensive.springoot.Entity.Patient;
import comprehensive.springoot.Exception.ResourceNotFoundexception;
import comprehensive.springoot.Repository.DoctorRepository;
import comprehensive.springoot.Repository.PatientRepository;
import comprehensive.springoot.dto.DoctorNameResponse;
//import comprehensive.springoot.dto.ShowPatientInfo;
import comprehensive.springoot.service.ComprehensiveService;

@Service
public class ComprehensiveServiceImpl implements ComprehensiveService{

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	
	public ComprehensiveServiceImpl(DoctorRepository doctorRepository, PatientRepository patientRepository) {
		super();
		this.doctorRepository = doctorRepository;
		this.patientRepository = patientRepository;
	}

	@Override
	public Doctor saveDoctor(Doctor docter) {
		return doctorRepository.save(docter);
		 
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(Long doctorId) {
		Optional<Doctor> doctor= doctorRepository.findById(doctorId);
		return doctor.get();
	}

	@Override
	public Patient getPatientById(Long patientId) throws ResourceNotFoundexception {
		Optional<Patient> patient = patientRepository.findById(patientId);
		if(!patient.isPresent()) {
			throw new ResourceNotFoundexception("No such patient there in the database");
		}
		return patient.get();
	}

	@Override
	public Doctor getDoctorByName(String doctorName) {
    return doctorRepository.findByDoctorName(doctorName);
		
	}
	
	  @Override 
	  public List<DoctorNameResponse> getAllDoctorsName()	
	  { 
		return  doctorRepository.findAllDoctorName().stream().map(DoctorNameResponse:: new).collect(Collectors.toList()); 
		}

		/*
		 * @Override public List<ShowPatientInfo> getInfoPatient() {
		 * 
		 * return patientRepository.getPatientInfo(); }
		 */
}
