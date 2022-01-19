package comprehensive.springoot.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Builder;

@Builder
@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long doctorId;
	
	private String doctorName;
	
	private int doctorAge;
	
	private String doctorGender;
	
	private String specialistField;
	
	//@OneToMany(targetEntity= Patient.class,cascade=CascadeType.ALL)
    //@JoinColumn(referencedColumnName="doctorId")
	
	@OneToMany(mappedBy="doctor",cascade=CascadeType.ALL)
	@JsonManagedReference
	
	private List<Patient> patients;
	
	public Doctor() {
		super();
	}

	public Doctor(Long doctorId, String doctorName, int doctorAge, String doctorGender, String specialistField,
			List<Patient> patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.specialistField = specialistField;
		this.patients = patients;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getDoctorAge() {
		return doctorAge;
	}

	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public String getSpecialistField() {
		return specialistField;
	}

	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

}

