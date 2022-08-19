package co.grandcircus.bookshelfapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.bookshelfapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findByTitleContainsIgnoreCaseOrAuthorContainsIgnoreCase(String q,
			String q2);

	List<Book> findByLentOut(Boolean lentOut);
	
	@Query("from Book where ( lower(title) like concat('%', lower(?1), '%') or lower(author) like concat('%', lower(?1), '%') ) and lentOut = ?2")
	List<Book> findByQueryAndLentOut(String q, Boolean lentOut);
	
}
