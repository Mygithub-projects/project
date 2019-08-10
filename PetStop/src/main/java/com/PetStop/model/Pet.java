package com.PetStop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.context.annotation.Scope;

import java.io.*;

@Entity
@Table(name="pets")
@SequenceGenerator(name="petId_generator", sequenceName = "pets_petid_seq", allocationSize=1) 
public class Pet implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="petId_generator")
@Column(name="petid")
private Integer petId;
@Column(name="petname")
private String petName;
@Column(name="petage")
private Integer petAge;
@Column(name="petplace")
private String petPlace;

//@Transient
//private int ownerId;

@ManyToOne
@JoinColumn(name="ownerid")
private User user;


public Pet() {
	
	// TODO Auto-generated constructor stub
}

public Pet(Integer petId, String petName, Integer petAge, String petPlace) {
	super();
	this.petId = petId;
	this.petName = petName;
	this.petAge = petAge;
	this.petPlace = petPlace;
	//this.ownerId = ownerId;
}





public Integer getPetId() {
	return petId;
}


public void setPetId(Integer petId) {
	this.petId = petId;
}


public String getPetName() {
	return petName;
}


public void setPetName(String petName) {
	this.petName = petName;
}


public Integer getPetAge() {
	return petAge;
}


public void setPetAge(Integer petAge) {
	this.petAge = petAge;
}


public String getPetPlace() {
	return petPlace;
}


public void setPetPlace(String petPlace) {
	this.petPlace = petPlace;
}

/*public int getOwnerId() {
	return ownerId;
}

public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}*/
public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Pet [petId=" + petId + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace + "]";
}




}
