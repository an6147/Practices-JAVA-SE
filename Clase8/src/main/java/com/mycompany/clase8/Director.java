/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

/**
 *
 * @author Cempai
 */
public class Director extends Person{
    private double assessment;

    public Director() {
    }

    public Director(double assessment, String name, String lastName, String DNI) {
        super(name, lastName, DNI);
        this.assessment = assessment;
    }
    
    

    public double getAssessment() {
        return assessment;
    }

    public void setAssessment(double assessment) {
        this.assessment = assessment;
    }
    
    
    
}
