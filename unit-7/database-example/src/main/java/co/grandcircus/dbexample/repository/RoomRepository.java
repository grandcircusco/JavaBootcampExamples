package co.grandcircus.dbexample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.grandcircus.dbexample.model.Room;

public interface RoomRepository extends MongoRepository<Room, String> {

	List<Room> findByAvailableIsTrueAndMaxCapacityGreaterThanEqual(
			int neededCapacity);

	List<Room> findByAvailableIsTrue();

	List<Room> findByMaxCapacityGreaterThanEqual(int neededCapacity);

}
