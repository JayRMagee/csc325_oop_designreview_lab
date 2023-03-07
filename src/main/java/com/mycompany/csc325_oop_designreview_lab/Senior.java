/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author jayso
 */
public class Senior extends Student {
    //private int credits;

    public Senior(String name, int age, int credits) {
        super(name, age, credits);

        try {
            if (credits >= 85) {
                //System.out.println("Good job");
            }
        } catch (Exception e) {
            System.out.println("You not a senior bitch");
        }
    }

    @Override
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Senior{" + super.toString() + '}';
    }
}
