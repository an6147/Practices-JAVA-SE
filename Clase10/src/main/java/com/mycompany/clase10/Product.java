/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase10;

import java.text.DecimalFormat;

/**
 *
 * @author Cempai
 */
public class Product {
    private double weight;
    private double value;
    private String ID;
    private boolean assigned;
    private String type;

    public Product() {
        
    }

    public Product(double weight, double value, String ID, boolean assigned, String type) {
        this.weight = weight;
        this.value = value;
        this.ID = ID;
        this.assigned = assigned;
        this.type = type;
    }
    
    
   
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean getAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public void printProduct(){
        DecimalFormat decimales = new DecimalFormat("00.00");
        System.out.println("ID: " + this.getID() + " Value: " + decimales.format(this.getValue()) + " Type: " + this.getType() + " Weight: " + decimales.format(this.getWeight())  + " Assigned: " + this.getAssigned());
    }
    
}
