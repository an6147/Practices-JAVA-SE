/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author Cempai
 */
public class CrowPlataform {
    private String name;
    private double ownMoney;
    private static double totalMoney=0.0;

    public CrowPlataform(String name) {
        this.name = name;
    }

    
    
    
    //-------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return ownMoney;
    }

    public void setMoney(double money) {
        this.ownMoney = money;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        CrowPlataform.totalMoney = totalMoney;
    }
    
    //-----------------------------------------------------
    public void assignMoney(double amountMoney){
        totalMoney = totalMoney - amountMoney;
        this.ownMoney = amountMoney;
    
    }
    
    public static void printTotalMoney(){
        System.out.println("The money available is: " + totalMoney);
    
    }
    
    public static void collectMoney(double money){
        CrowPlataform.totalMoney += money;
    
    }
}
