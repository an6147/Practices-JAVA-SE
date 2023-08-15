/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase7;

/**
 *
 * @author Cempai
 */
public class SoccerPlayer extends Person{
    private String position;
    private double value;

    public SoccerPlayer(String name, String lastName, String DNI) {
        super(name, lastName, DNI);
    }
    
    
    
    public SoccerPlayer(String position, double value){
        this.position = position;
        this.value = value;
    }

    public SoccerPlayer() {
    }
    
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public void print(){
        super.print();
        System.out.println("Position: " + this.getPosition() + " Value: " + this.getValue());
    }
    
}
