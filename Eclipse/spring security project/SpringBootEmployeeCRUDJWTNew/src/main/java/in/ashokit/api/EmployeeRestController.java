package in.ashokit.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Employee;
import in.ashokit.exception.ResourceNotFoundException;
import in.ashokit.service.EmployeeService;
import in.ashokit.util.JwtUtil;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@PostMapping("/login")
	public ResponseEntity<JwtResponse> login(@RequestBody AuthRequest authRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword())
				);
		
		String token = jwtUtil.generateToken(authRequest.getUsername());
		JwtResponse jwtResp =  new JwtResponse(authRequest.getUsername(), token);
		
		return new ResponseEntity<>(jwtResp ,HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/employees",
			produces = {"application/json"})
	public ResponseEntity<List<Employee>> getAllEmployees () {
		List<Employee> list = employeeService.fetchAll();
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping(value = "/employee/{id}",
				produces = {"application/json"})
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id){
		Employee employee = employeeService.fetchById(id);
		
		if( employee == null ) {
			throw new ResourceNotFoundException("Employee not found with id "+ id);
		}
		else {
			return new ResponseEntity<>(employee,HttpStatus.OK);
		}
	}
	
	@PostMapping(value = "/save" ,
					consumes={"application/json"},
					produces={"application/json"})
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		try {
			Employee savedEmployee = employeeService.save(employee);
			
			return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
		}
		catch( Exception ex) {
			return new ResponseEntity<Employee>((Employee)null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping(value = "/update" ,
			consumes = {"application/json"},
			produces = {"application/json"})
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee e) {
		Employee updatedEmployee = employeeService.fetchById(e.getEmpno());
		
		if( updatedEmployee == null ) {
			throw new ResourceNotFoundException("Employee not found with id" + e.getEmpno());
		}
		else {
			Employee emp = employeeService.save(updatedEmployee);
			
			return new ResponseEntity<>(emp, HttpStatus.OK);
		}
	}
	
	@PatchMapping(value = "/update/{id}"  ,
			consumes = {"application/json"},
			produces = {"application/json"})
	public ResponseEntity<Employee> partialUpdate(@PathVariable("id") Integer id, @RequestBody Map<String, Object> map) {
		Employee empFromDB = employeeService.fetchById(id);
		
		if(empFromDB == null) {
			throw new ResourceNotFoundException("Employee not with id " + id);
		}
		else {
			Employee emp = employeeService.updateBySal(id, (double)map.get("sal"));
			return new ResponseEntity<>(emp, HttpStatus.OK);
		}
	}
	
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
		Employee empFromDB = employeeService.fetchById(id);
		
		if(empFromDB == null) {
			throw new ResourceNotFoundException("Employee not found with id" + id);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
