package com.theone.hb.relation.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PrimeMinister {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pmId;
	private String pmName;
	@OneToOne(cascade=CascadeType.ALL)
	private Country country;
	
	public int getId() {
		return pmId;
	}

	public void setId(int pmId) {
		this.pmId = pmId;
	}
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country= country;
	}

	public String getName() {
		return pmName;
	}

	public void setName(String pmName) {
		this.pmName = pmName;
	}

	
	  public String toString() {
		  return "PrimeMinister["+pmId+", "+pmName+"]\n";
		  }
	 

	public int hashCode() {
		return  pmId ;

	}

}
