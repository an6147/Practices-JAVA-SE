/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase5;

/**
 *
 * @author Cempai
 */
public class Clase5 {

    public static void main(String[] args) {
        User u1 = new User("Juan", 300.0);
        User u2 = new User("Antonio", 1.5);
        User u3 = new User("José", 500.0);
        User.printNumUsers();
        System.out.println("The user 2 have the id: " + u2.getIdUser());
        CrowPlataform p1 = new CrowPlataform("Save the Whales");
        CrowPlataform p2 = new CrowPlataform("Save the sun");
        u1.donateAllMoney();
        u2.donateAllMoney();
        u3.donateAllMoney();
        CrowPlataform.printTotalMoney();
        p1.assignMoney(500.0);
        p2.assignMoney(1.5);
        CrowPlataform.printTotalMoney();
        
    }
}
