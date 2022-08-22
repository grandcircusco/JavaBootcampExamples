package co.grandcircus.avengersapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "characters")
public class AvCharacter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	private String name;
	private Integer strength;
	private Boolean good;
	private String skill;
	
	public AvCharacter() {}
	
	public AvCharacter(String name, Integer strength, Boolean good, String skill) {
		this.name = name;
		this.strength = strength;
		this.good = good;
		this.skill= skill;
	}
	
	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	public String getSkills() {
		return skill;
	}

	public void setSkills(String skill) {
		this.skill = skill;
	}

}
