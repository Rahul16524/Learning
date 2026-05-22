package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> fetchAll(){
		List<Employee> empList = employeeRepository.findAll();
		
		return empList;
	}
	
	
	
	public Employee fetchById(Integer id) {
		Employee emp = employeeRepository.findById(id).orElse(null);
		
		return emp;
	}

	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employeeRepository.save(employee);
		
		return savedEmployee;
	}

	public Employee updateBySal(int empno, double sal) {
		employeeRepository.updateSal(sal,empno);
		
		return fetchById(empno);
	}
}
