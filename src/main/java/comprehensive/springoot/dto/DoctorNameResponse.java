package comprehensive.springoot.dto;

public class DoctorNameResponse {

	private String doctorName;

	public DoctorNameResponse(String doctorName) {
		super();
		this.doctorName = doctorName;
	}

	public DoctorNameResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
}
