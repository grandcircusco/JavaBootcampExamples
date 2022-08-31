package co.grandcircus.bookshelfapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.bookshelfapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByUsername(String username);
	
}
