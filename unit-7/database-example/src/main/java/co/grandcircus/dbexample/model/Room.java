package co.grandcircus.dbexample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("rooms")
public class Room {

	@Id
	private String id;
	private String name;
	private Integer maxCapacity;
	private Boolean available;

	public Room() {
	}

	public Room(String id, String name, Integer capacity, Boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.maxCapacity = capacity;
		this.available = available;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", maxCapacity="
				+ maxCapacity + ", available=" + available + "]";
	}

}
