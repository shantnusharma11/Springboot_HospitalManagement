package comprehensive.springoot.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
@Builder
@Entity
@Table(name="patients")
public class Patient {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long patientId;
	
	private int patientAge;
	private String patientName;
	
	@JsonFormat(pattern="yyyy/MM/dd")
	private Date visitDate;
	
	private String doctorPrescription;

	
	@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(referencedColumnName="doctorId")
	@JsonBackReference
	private Doctor doctor;


	public Patient() {
		super();
	}


	public Patient(Long patientId, int patientAge, String patientName, Date visitDate, String doctorPrescription,
			Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientAge = patientAge;
		this.patientName = patientName;
		this.visitDate = visitDate;
		this.doctorPrescription = doctorPrescription;
		this.doctor = doctor;
	}


	public Long getPatientId() {
		return patientId;
	}


	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}


	public int getPatientAge() {
		return patientAge;
	}


	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public Date getVisitDate() {
		return visitDate;
	}


	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}


	public String getDoctorPrescription() {
		return doctorPrescription;
	}


	public void setDoctorPrescription(String doctorPrescription) {
		this.doctorPrescription = doctorPrescription;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	}