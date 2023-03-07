/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author jayson
 */
public class Freshman extends Student {
    
    /**
     * this is the parameterized constructor for Freshman class
     * @param name
     * @param age
     * @param credits 
     */
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }

    /**
     * this is the tostring method
     * @return 
     */
    @Override
    public String toString() {
        return "Freshman{" + super.toString()+ "}";
    }
}
