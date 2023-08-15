/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author Cempai
 */
public class User {
    private String name;
    private double moneyAvailable;
    private int idUser;
    private static int numUsers;

    public User(String name, double moneyAvailable) {
        this.name = name;
        this.moneyAvailable = moneyAvailable;
        this.idUser = User.getNumUsers();
        //numUsers = numUsers + 1;
        User.setNumUsers(User.getNumUsers() + 1);
    }

    public User() {
    }
    
    
    //------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public static int getNumUsers() {
        return numUsers;
    }

    public static void setNumUsers(int numUsers) {
        User.numUsers = numUsers;
    }
    
    //-------------------------------------------------
    public static void printNumUsers(){
        System.out.println("The number users is: " + User.getNumUsers());
    
    }
    
    public void donateAllMoney (){
        CrowPlataform.collectMoney(this.moneyAvailable);
        this.setMoneyAvailable(0.0);
    }
    
    
}
