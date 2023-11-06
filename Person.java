package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String name;
	private String gender;
	private int age;
	
	@OneToOne
	private Pancard pan;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Pancard getPan() {
		return pan;
	}

	public void setPan(Pancard pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", pan=" + pan + "]";
	}
	

}
