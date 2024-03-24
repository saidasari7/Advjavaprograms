package com.sathya.jdbcEx2;

 public class Employee {
	 
	
	  int empId;
	  String empName;
	  double empsalary;
	  public Employee(int empId, String empName, double empsalary) {
	   super();
	   this.empId = empId;
	   this.empName = empName;
	   this.empsalary = empsalary;
	  }
	  
	  public Employee() {
	   // TODO Auto-generated constructor stub
	  }

	  @Override
	  public String toString() {
	   return "Employee [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	  }
	  public int getEmpId() {
	   return empId;
	  }
	  public void setEmpId(int empId) {
	   this.empId = empId;
	  }
	  public String getEmpName() {
	   return empName;
	  }
	  public void setEmpName(String empName) {
	   this.empName = empName;
	  }
	  public double getEmpsalary() {
	   return empsalary;
	  }
	  public void setEmpsalary(double empsalary) {
	   this.empsalary = empsalary;
	  }
	  
	 }