package co.grandcircus.bookshelfapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.grandcircus.bookshelfapi.model.User;
import co.grandcircus.bookshelfapi.repository.UserRepository;

@RestController
@CrossOrigin // Allow any website to access this API
public class UserApiController {

	@Autowired
	private UserRepository repo;
	
	// C(R)UD -- Read All
	@GetMapping("/users")
	public List<User> readAll(@RequestParam(required=false) String username) {
		if (username != null && !username.isBlank()) {
			return repo.findByUsername(username);
		} else {
			return repo.findAll();
		}
	}
	
	// C(R)UD -- Read One
	@GetMapping("/users/{id}")
	public User readOne(@PathVariable("id") Long id) {
		return repo.findById(id).orElseThrow(() -> new UserNotFoundException(id) );
	}
	
	// (C)RUD -- Create
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public User create(@RequestBody User avchar) {
		repo.save(avchar);
		return avchar;
	}
	
	// CRU(D) -- Delete
	@DeleteMapping("/users/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
	
	// CR(U)D -- Update
	@PutMapping("/users/{id}")
	public User update(@PathVariable("id") Long id,
			@RequestBody User avchar) {
		avchar.setId(id);
		return repo.save(avchar);
	}
	
	@ResponseBody
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String characterNotFoundHandler(UserNotFoundException ex) {
		return ex.getMessage();
	}
	
}
