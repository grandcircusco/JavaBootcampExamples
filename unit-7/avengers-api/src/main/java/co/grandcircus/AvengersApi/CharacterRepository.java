package co.grandcircus.AvengersApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<AvCharacter, Long> {
	List<AvCharacter> findBySkill(String skill);
}
