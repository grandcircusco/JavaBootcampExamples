package co.grandcircus.avengersapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.avengersapi.model.AvCharacter;

public interface CharacterRepository extends JpaRepository<AvCharacter, Long> {
	List<AvCharacter> findBySkill(String skill);
}
