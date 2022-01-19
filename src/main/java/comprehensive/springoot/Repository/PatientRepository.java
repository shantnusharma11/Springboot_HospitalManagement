package comprehensive.springoot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import comprehensive.springoot.Entity.Patient;
import comprehensive.springoot.dto.ShowPatientInfo;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{
	/*
	 * @Query("SELECT new comprehensive.springboot.dto.ShowPatientInfo(p.patientName,p.visitDate,d.doctorName) FROM Patient p JOIN p.doctors d"
	 * ) public List<ShowPatientInfo> getPatientInfo();
	 */
}
