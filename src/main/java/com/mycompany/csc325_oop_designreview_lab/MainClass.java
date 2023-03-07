/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

    public static void main(String[] args) {
        //creates freshman object
        Student std1 = new Freshman("James", 20, 12); // name, age, credits

        //creates a senior object
        Student std2 = new Senior("John", 30, 90);

        //creates a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter GPA for James: ");
        std1.setGpa(input.nextDouble());

        System.out.println("Enter GPA for Jogn");
        std2.setGpa(input.nextDouble());

        System.out.println(std1);
        System.out.println(std2);

    }

}
