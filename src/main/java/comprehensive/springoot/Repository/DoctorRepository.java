package comprehensive.springoot.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import comprehensive.springoot.Entity.Doctor;
import comprehensive.springoot.dto.DoctorNameResponse;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>{

	public Doctor findByDoctorName(String doctorName);

@Query("SELECT doctorName FROM Doctor doctor ")
   List<String> findAllDoctorName();
}
