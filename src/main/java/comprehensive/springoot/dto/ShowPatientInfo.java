package comprehensive.springoot.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


import lombok.ToString;


@ToString
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class ShowPatientInfo {
	
	private String patientName;

	private Date visitDate;
	
	private String doctorName;

	
	public ShowPatientInfo() {
		super();
		
	}
	public ShowPatientInfo(String patientName, Date visitDate, String doctorName) {
		super();
		this.patientName = patientName;
		this.visitDate = visitDate;
		this.doctorName = doctorName;
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


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}	
	
}
