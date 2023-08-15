/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase7;

/**
 *
 * @author Cempai
 */
public class Person {
    private String name;
    private String lastName;
    private String DNI;

    public Person(String name, String lastName, String DNI) {
        this.name = name;
        this.lastName = lastName;
        this.DNI = DNI;
    }

    public Person() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public void print(){
        System.out.println("Name: " + this.getName() + " Last_Name: " + this.getLastName() + " DNI:" + this.getDNI());
    }
    
    
}
