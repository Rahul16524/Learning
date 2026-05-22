package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// In EmployeeRepository.java
	@Modifying
	@Transactional
	@Query(value = "UPDATE EMPLOYEES SET SAL = :sal WHERE EMPNO = :empno", nativeQuery = true)
	void updateSal(@Param("sal") double sal, @Param("empno") int empno);
}
