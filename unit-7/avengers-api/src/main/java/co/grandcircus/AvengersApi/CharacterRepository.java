package co.grandcircus.AvengersApi;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<AvCharacter, String> {
	List<AvCharacter> findBySkills(String skill);
}
