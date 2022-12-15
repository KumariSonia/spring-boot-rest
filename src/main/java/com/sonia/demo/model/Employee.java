package com.sonia.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	//@GeneratedValue
	private int employee_id;
	private String emplyoee_name;
	private String employee_technology;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmplyoee_name() {
		return emplyoee_name;
	}

	public void setEmplyoee_name(String emplyoee_name) {
		this.emplyoee_name = emplyoee_name;
	}

	public String getEmployee_technology() {
		return employee_technology;
	}

	public void setEmployee_technology(String employee_technology) {
		this.employee_technology = employee_technology;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", emplyoee_name=" + emplyoee_name + ", employee_technology="
				+ employee_technology + "]";
	}

}
