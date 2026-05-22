package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "EMPLOYEES")

public class Employee implements java.io.Serializable{
	
	@Id
//	@NotNull(message = "empno is required")
	@NotNull(message = "emp.empno.not.null")
	@Positive(message = "emp.empno.positive")
	private Integer empno;
	
	@NotBlank(message = "{emp.ename.not.blank}")
	private String ename;
	
	@NotNull(message = "{emp.sal.not.null}")
	@Positive(message = "{emp.sal.positive}")
	private Double sal;

	 // ✅ REQUIRED by Hibernate
    public Employee() {
    }
    
	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public String getEname() {
		return ename;
	}

	public Employee(@NotNull(message = "emp.empno.not.null") @Positive(message = "emp.empno.positive") Integer empno,
			@NotBlank(message = "{emp.ename.not.blank}") String ename,
			@NotNull(message = "{emp.sal.not.null}") @Positive(message = "{emp.sal.positive}") Double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
}
