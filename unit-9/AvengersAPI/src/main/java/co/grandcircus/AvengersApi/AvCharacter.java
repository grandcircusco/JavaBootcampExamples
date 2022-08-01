package co.grandcircus.AvengersApi;

import java.util.List;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("characters")
public class AvCharacter {
	@Id
	public String id;
	
	private String name;
	private Integer strength;
	private Boolean good;
	private List<String> skills;
	
	public AvCharacter() {}
	
	public AvCharacter(String name, Integer strength, Boolean good, List<String> skills) {
		this.name = name;
		this.strength = strength;
		this.good = good;
		this.skills = skills;
	}
	
	// Getters and Setters
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
	
	public Integer getStrength() {
		return this.strength;
	}
	
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	
	public Boolean getGood() {
		return good;
	}
	
	public void setGood(Boolean good) {
		this.good = good;
	}
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

}
