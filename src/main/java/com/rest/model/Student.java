package com.rest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private double sfee;
	private String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, double sfee, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", address=" + address + "]";
	}
	

}
