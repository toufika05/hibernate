package com.theone.hb.relation.one2one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int countryId;
	private String countryName;

	public int getId() {
		return countryId;
	}

	public void setId(int countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return countryName;
	}

	public void setName(String countryName) {
		this.countryName = countryName;
	}

	
	  public String toString() {
		  return "Country["+countryId+", "+countryName+"]\n";
		  }
	 

	public int hashCode() {
		return  countryId ;

	}
	

}
