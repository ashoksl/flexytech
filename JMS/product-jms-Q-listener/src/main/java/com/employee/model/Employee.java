package com.employee.model;

public class Employee {
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private String employeeId;
	
	private String employeeName;
	
	private String experience;
	
	private String age;
	
	@Override
	public String toString() {
		return super.toString()+" : employeeId : "+employeeId+" : employeeName :"+employeeName
				+" : experience : "+experience+" : age : "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj))
			return true;
		if(obj instanceof Employee){
			Employee employee = (Employee) obj;
			if(this.getAge().equals(employee.getAge()) && this.getEmployeeId().equals(employee.getEmployeeId())
					&& this.getEmployeeName().equals(employee.getEmployeeName()) && this.getExperience().equals(employee.getExperience())){
				return true;
			}
		}
		return false;
	}
	
}
