/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

/**
 *
 * @author Cempai
 */
public class School {
    private ClassRoom[] classRooms;
    private String name;
    private Director director;

    public School() {
    }

    public School(ClassRoom[] classRooms, String name, Director director) {
        this.classRooms = classRooms;
        this.name = name;
        this.director = director;
    }
    
    

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
    
    public double getAverageQualificationTotal(){
        double additionTotal = 0;
        for(int i = 0; i < this.getClassRooms().length; i++){
            additionTotal = additionTotal + this.getClassRooms()[i].getAverageQualificationClassRoom();
        }
        return (additionTotal/this.getClassRooms().length) + (this.getDirector().getAssessment() * 0.3);
    }
    
    public Student getTheBestStudentSchool(){
        Student s1 = new Student();
        double bestQualification = 0.0;
        for(int i = 0; i < this.getClassRooms().length; i++){
            if(this.getClassRooms()[i].getTheBestStudent().getAverageQualification() > bestQualification){
                s1 = this.getClassRooms()[i].getTheBestStudent();
                bestQualification = s1.getAverageQualification();
            }
        }
        return s1;
    }
    
    public void printStats(){
        System.out.println("Summary about stats of the school: " + this.getName());
        System.out.println("The best student of the school is: ");
        this.getTheBestStudentSchool().printStudent();
        
        if(this.getAverageQualificationTotal() > 5.0){
            System.out.println("The school if i can opt for the subsidy with a average of: " + this.getAverageQualificationTotal() + "points");
        }else{
            System.out.println("Sorry, the school not can opt for the subsidy");
        }
    }
    
    
}
