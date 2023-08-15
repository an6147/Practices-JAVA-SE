/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

/**
 *
 * @author Cempai
 */
public class ClassRoom {
    private Student[] students;
    private Teacher teacher;
    private String idClassRoom;

    public ClassRoom() {
    }

    public ClassRoom(Student[] students, Teacher teacher, String idClassRoom) {
        this.students = students;
        this.teacher = teacher;
        this.idClassRoom = idClassRoom;
    }
    
    

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getIdClassRoom() {
        return idClassRoom;
    }

    public void setIdClassRoom(String idClassRoom) {
        this.idClassRoom = idClassRoom;
    }
    
    public double getAverageQualificationClassRoom(){
        double additionTotal=0;
        for(int i = 0; i < this.getStudents().length; i++){
            if(this.getStudents()[i] instanceof ComanderCourse){
                ComanderCourse c1 = (ComanderCourse)this.getStudents()[i];
                additionTotal = additionTotal + (0.1*c1.getAssessment());
                additionTotal = additionTotal + this.getStudents()[i].getAverageQualification();
            }else {
                additionTotal = additionTotal + this.getStudents()[i].getAverageQualification();
            }
        }
        return additionTotal/this.getStudents().length;
    }
    
    public void printStudents(){ 
        System.out.println("======================" + this.getIdClassRoom() + "======================");
        for(int i = 0; i < this.getStudents().length; i++){
            this.getStudents()[i].printStudent();
        }
        System.out.println("=======================================================================");
        
    }
    
    public Student getTheBestStudent(){
        Student theBestStudent = new Student();
        double theBestQualification = 0;
        for(int i = 0; i < this.getStudents().length; i++){
            if (this.getStudents()[i].getAverageQualification() > theBestQualification){
                theBestQualification = this.getStudents()[i].getAverageQualification();
                theBestStudent = this.getStudents()[i];
            }
        }
        return theBestStudent;
    }
    
}
