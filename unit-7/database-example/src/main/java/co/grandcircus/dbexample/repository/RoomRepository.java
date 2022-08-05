package co.grandcircus.dbexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.dbexample.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

	List<Room> findByAvailableIsTrueAndMaxCapacityGreaterThanEqual(
			int neededCapacity);

	List<Room> findByAvailableIsTrue();

	List<Room> findByMaxCapacityGreaterThanEqual(int neededCapacity);

}
