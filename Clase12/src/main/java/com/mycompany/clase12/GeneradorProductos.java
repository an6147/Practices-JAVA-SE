/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase12;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cempai
 */
public class GeneradorProductos {
    public static ArrayList<Product> generarProductos (int n){
        Random r = new Random();
        ArrayList<Product> lproductos = new ArrayList<Product>();
        
        for(int i = 0; i < n; i++){
            Product p = new Product();
            p.setID(Integer.toString((int)(Math.random()*1000000)));
            p.setValue(r.nextDouble()*1000);
            lproductos.add(p);
        }
        return lproductos;
    }
}
