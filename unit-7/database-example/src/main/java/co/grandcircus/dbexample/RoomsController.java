package co.grandcircus.dbexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.dbexample.model.Room;
import co.grandcircus.dbexample.repository.RoomRepository;

@Controller
public class RoomsController {
	
	// Autowired tells spring to fill in the repo variable automatically
	// when the application starts.
	@Autowired
	private RoomRepository repo;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/rooms";
	}

	@RequestMapping("/rooms")
	public String list(
			@RequestParam(required = false) boolean onlyShowAvailable,
			@RequestParam(required = false) Integer neededCapacity,
			Model model) {
		List<Room> rooms;
		if (onlyShowAvailable && neededCapacity != null) {
			// both form fields specified
			rooms = repo.findByAvailableIsTrueAndMaxCapacityGreaterThanEqual(neededCapacity);
		} else if (onlyShowAvailable) {
			// only checkbox checked
			rooms = repo.findByAvailableIsTrue();
		} else if (neededCapacity != null) {
			// only number filled out
			rooms = repo.findByMaxCapacityGreaterThanEqual(neededCapacity);
		} else {
			// no filter criteria specified in form
			rooms = repo.findAll(Sort.by("name"));
		}
		model.addAttribute("rooms", rooms);
		return "list";
	}
	
	@RequestMapping("/rooms/detail")
	public String detail(@RequestParam String id, Model model) {
		Room room = repo.findById(id).get();
		model.addAttribute("room", room);
		return "detail";
	}
	
	@RequestMapping("/rooms/edit")
	public String edit(@RequestParam String id, Model model) {
		Room room = repo.findById(id).get();
		model.addAttribute("room", room);
		return "edit";
	}
	
	@PostMapping("/rooms/edit")
	public String save(@RequestParam String id, Room room) {
		repo.save(room);
		return "redirect:/rooms/detail?id=" + id;
	}
	
	@RequestMapping("/rooms/add")
	public String showAdd() {		
		return "add";
	}
	
	@PostMapping("/rooms/add")
	public String submitAdd(Room room) {	
		repo.save(room); // "save" is used for both update and create
		return "redirect:/rooms";
	}
	
	@RequestMapping("/rooms/delete")
	public String remove(@RequestParam String id) {
		repo.deleteById(id);
		return "redirect:/rooms";
	}
}
