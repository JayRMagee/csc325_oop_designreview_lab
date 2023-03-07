/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    private String name;
	String address;
	private int age;

	// constructor that takes only two paras
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

        //getter method for name
	public String getName() {
		return name;
	}

        //setter method for name
	public void setName(String name) {
		this.name = name;
	}

        // abstract getter method for address
	public abstract String getAddress() ;

        //abstract setter method for address
	public abstract void setAddress(String address);

        //getter method for age
	public int getAge() {
		return age;
	}

        //setter method for age
	public void setAge(int age) {
		this.age = age;
	}
}