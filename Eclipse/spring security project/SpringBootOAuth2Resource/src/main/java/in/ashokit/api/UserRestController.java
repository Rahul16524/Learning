package in.ashokit.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.model.User;

@RestController
public class UserRestController {
	
	
	Map<String, User> userMap;
	
	public UserRestController() {
		userMap = new HashMap<>();
		userMap.put("mike@gmail.com", new User("mike", "artheton", "mike@gmail.com", 9890089900L));
		userMap.put("jane@gmail.com", new User("jane", "markam", "jane@gmail.com", 9890089900L));
		userMap.put("john@gmail.com", new User("john", "doe", "john@gmail.com", 9866565432L));

	}
	
	@GetMapping("/user/{email}")
	public ResponseEntity<User> getUser(@PathVariable("email") String email) {
		
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/users")
	public ResponseEntity<Map<String, User>> getUsers() {
		return ResponseEntity.ok(userMap);
	}
}
