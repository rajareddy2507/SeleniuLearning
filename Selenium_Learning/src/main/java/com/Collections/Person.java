package com.Collections;

public class Person {
private int empNo;
private String empName;
private Address address;

public Person(int empNo, String empName, Address address) {
	super();
	this.empNo = empNo;
	this.empName = empName;
	this.address = address;
}
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String toString() {
	return "Person [empNo=" + empNo + ", empName=" + empName + ", address=" + address + "]";
}


}
