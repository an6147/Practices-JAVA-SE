/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

/**
 *
 * @author Cempai
 */
public class Student extends Person{
    private String course;
    private double averageQualification;

    public Student() {
    }

    public Student(String course, double averageQualification, String name, String lastName, String DNI) {
        super(name, lastName, DNI);
        this.course = course;
        this.averageQualification = averageQualification;
    }
    
    
    

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getAverageQualification() {
        return averageQualification;
    }

    public void setAverageQualification(double averageQualification) {
        this.averageQualification = averageQualification;
    }
    
    public void printStudent(){
        super.print();
        System.out.println(" Course: " + this.getCourse() + " AverageQualification: " + this.getAverageQualification());
    }
    
}
