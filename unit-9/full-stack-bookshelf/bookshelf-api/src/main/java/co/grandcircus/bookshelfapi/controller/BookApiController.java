package co.grandcircus.bookshelfapi.controller;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.grandcircus.bookshelfapi.model.Book;
import co.grandcircus.bookshelfapi.repository.BookRepository;

@RestController
// Allow specific websites to access this API...
@CrossOrigin(origins = { "http://localhost:4200", "https://mywebsite.com" })
public class BookApiController {

	@Autowired
	private BookRepository repo;

	@RequestMapping("/")
	public Map<String, Object> home() {
		Map<String, Object> result = new LinkedHashMap<>();
		result.put("status", "OK");
		result.put("collections", new String[] { "/books" });
		return result;
	}
	
	// C(R)UD -- Read All
	@GetMapping("/books")
	public List<Book> readAll(@RequestParam(required=false) String q, @RequestParam(required=false) Boolean lentOut) {
		if (q != null && !q.isBlank()) {
			if (lentOut != null) {
				return repo.findByQueryAndLentOut(q, lentOut);
			} else {
				return repo.findByTitleContainsIgnoreCaseOrAuthorContainsIgnoreCase(q, q);
			}
		} else if (lentOut != null) {
			return repo.findByLentOut(lentOut);
		} else {
			return repo.findAll();
		}
	}
	
	// C(R)UD -- Read One
	@GetMapping("/books/{id}")
	public Book readOne(@PathVariable("id") Long id) {
		return repo.findById(id).orElseThrow(() -> new BookNotFoundException(id) );
	}
	
	// (C)RUD -- Create
	@PostMapping("/books")
	@ResponseStatus(HttpStatus.CREATED)
	public Book create(@RequestBody Book avchar) {
		repo.save(avchar);
		return avchar;
	}
	
	// CRU(D) -- Delete
	@DeleteMapping("/books/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
	
	// CR(U)D -- Update
	@PutMapping("/books/{id}")
	public Book update(@PathVariable("id") Long id,
			@RequestBody Book avchar) {
		avchar.setId(id);
		return repo.save(avchar);
	}
	
	@ResponseBody
	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String characterNotFoundHandler(BookNotFoundException ex) {
		return ex.getMessage();
	}
	
}
