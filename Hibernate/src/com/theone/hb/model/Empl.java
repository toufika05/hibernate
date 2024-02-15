package com.theone.hb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity// it represents your class as an entity class which is going to map  a table
////jpa == java persistence api with hibernate
public class Empl {
	
  @Id
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	  public String toString() {
		  return "Empl["+id+", "+name+"]\n";
		  }
	 

	public int hashCode() {
		return id;

	}

	
	  public boolean equals(Object obj) { 
		  Empl st3 = (Empl) obj;
		  return this.id == st3.id; 
		  }
	
	}















