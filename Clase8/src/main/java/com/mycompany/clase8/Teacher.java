/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

/**
 *
 * @author Cempai
 */
public class Teacher extends Person{
    private String specialty;

    public Teacher() {
    }

    public Teacher(String specialty, String name, String lastName, String DNI) {
        super(name, lastName, DNI);
        this.specialty = specialty;
    }
    
    
    

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    
   
}
