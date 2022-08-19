package co.grandcircus.AvengersApi;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
public class CharacterController {
	@Autowired
	private CharacterRepository ch_repo;
	
	
	@GetMapping("/reset")
	public String reset() {
		
		// Delete all
		ch_repo.deleteAll();
		
		// Add characters
		
		AvCharacter ac = new AvCharacter("Iron Man",8,true, Arrays.asList("flying", "fighting", "intelligence"));
		ch_repo.insert(ac);
		
		ac = new AvCharacter("Thor",9,true, Arrays.asList("fighting", "strength"));
		ch_repo.insert(ac);
		
		ac = new AvCharacter("Hulk",10,true, Arrays.asList("fighting", "strength", "jumping"));
		ch_repo.insert(ac);
		
		ac = new AvCharacter("Black Panther",8, true, Arrays.asList("stealth", "intelligence", "fighting"));
		ch_repo.insert(ac);

		ac = new AvCharacter("Dr. Strange",7,true, Arrays.asList("magic", "intelligence"));
		ch_repo.insert(ac);
		
		ac = new AvCharacter("Thanos",9,false, Arrays.asList("strength", "intelligence"));
		ch_repo.insert(ac);
		
		return "Data reset.";

	}
	
	// C(R)UD -- Read All
	@GetMapping("/character")
	public List<AvCharacter> readAll(@RequestParam(required=false) String skill) {
		if (skill != null) {
			return ch_repo.findBySkills(skill);
		} else {
			return ch_repo.findAll();
		}
	}
	
	// C(R)UD -- Read One
	@GetMapping("/character/{id}")
	public AvCharacter readOne(@PathVariable("id") String id) {
		return ch_repo.findById(id).orElseThrow(() -> new CharacterNotFoundException(id) );
	}
	
	// (C)RUD -- Create
	@PostMapping("/character")
	@ResponseStatus(HttpStatus.CREATED)
	public AvCharacter create(@RequestBody AvCharacter avchar) {
		ch_repo.insert(avchar);
		return avchar;
	}
	
	// CRU(D) -- Delete
	@DeleteMapping("/character/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		ch_repo.deleteById(id);
	}
	
	// CR(U)D -- Update
	@PutMapping("/character/{id}")
	public AvCharacter update(@PathVariable("id") String id,
			@RequestBody AvCharacter avchar) {
		avchar.setId(id);
		return ch_repo.save(avchar);
	}
	
	@ResponseBody
	@ExceptionHandler(CharacterNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String characterNotFoundHandler(CharacterNotFoundException ex) {
		return ex.getMessage();
	}	
}
