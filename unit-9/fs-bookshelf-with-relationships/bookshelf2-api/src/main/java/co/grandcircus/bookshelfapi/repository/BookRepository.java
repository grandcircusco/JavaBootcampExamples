package co.grandcircus.bookshelfapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.bookshelfapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByOwnerId(Long ownerId);

	List<Book> findByOwnerIdAndLentOut(Long ownerId, Boolean lentOut);
	
	@Query("from Book where ownerId = ?1 and ( lower(title) like concat('%', lower(?2), '%') or lower(author) like concat('%', lower(?2), '%') )")
	List<Book> findByOwnerIdAndQuery(Long ownerId, String q);
	
	@Query("from Book where ownerId = ?1 and ( lower(title) like concat('%', lower(?2), '%') or lower(author) like concat('%', lower(?2), '%') ) and lentOut = ?3")
	List<Book> findByOwnerIdAndQueryAndLentOut(Long ownerId, String q, Boolean lentOut);
	
	List<Book> findByLentOutToId(Long userId);
	
}
