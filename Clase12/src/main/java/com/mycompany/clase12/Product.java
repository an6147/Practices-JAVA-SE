/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase12;

/**
 *
 * @author Cempai
 */
public class Product implements ProductInterface{
    
    private String ID;
    private double value;
    

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public double multiply(int n) {
        return (double)this.value * (double)n;
    }

    @Override
    public double value() {
        return this.value;
    }

    public double getValue() {
        return value;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("ID: " + this.getID() + " value: " + this.getValue());
    }
    
}
