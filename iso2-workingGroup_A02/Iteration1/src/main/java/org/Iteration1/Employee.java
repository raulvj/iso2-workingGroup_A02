package org.Iteration1;

import java.util.Date;

public class Employee {

	private String name;
	private Date birth_date;
	private int social_security;
	private String residence;
	/**
	 * This attribute is used to know if the employee is a Chief or a Mechanic.
	 * 
	 * If type is equal to 'true' then Chief.
	 * If type is equal to 'false' then Mechanic.
	 */
	private boolean type;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth_date() {
		return this.birth_date;
	}

	/**
	 * 
	 * @param birth_date
	 */
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public int getSocial_security() {
		return this.social_security;
	}

	/**
	 * 
	 * @param social_security
	 */
	public void setSocial_security(int social_security) {
		this.social_security = social_security;
	}

	public String getResidence() {
		return this.residence;
	}

	/**
	 * 
	 * @param residence
	 */
	public void setResidence(String residence) {
		this.residence = residence;
	}

	public boolean getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(boolean type) {
		this.type = type;
	}

}