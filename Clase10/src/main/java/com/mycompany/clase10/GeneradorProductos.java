/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase10;

import java.util.Random;

/**
 *
 * @author Cempai
 */
public class GeneradorProductos {
    public static Product[] generarProductos (int n){
        Random r = new Random();
        String[] listaTipo= {"A", "B", "C"};
        Product[] result = new Product[n];
        
        for(int i = 0; i < n; i++){
            Product p = new Product();
            p.setID(Integer.toString((int)(Math.random()*1000000)));
            p.setValue(r.nextDouble()*1000);
            p.setWeight(r.nextDouble()*10);
            p.setAssigned(false);
            p.setType(listaTipo[r.nextInt(listaTipo.length)]);
            result[i] = p;
        }
        return result;
    }
}
