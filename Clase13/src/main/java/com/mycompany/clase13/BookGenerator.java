/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase13;

import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cempai
 */
public class BookGenerator {
    
    
    public ArrayList<Book> bookGenerator(int n){
        ArrayList<Book> result = new ArrayList<Book>();
        for(int i = 0; i < n; i++){
            Book b = new Book(this.ISBNgenerator(), this.tittleGenerator(), this.authorGenerator(), this.priceGenerator());
            result.add(b);
        }
        return result;
    }
    
    public String ISBNgenerator(){
        Random r = new Random();
        String result ="";
        for(int i = 0; i < 10; i++){
            if(i%3 == 0){
                result +="-";
            }
            result += Integer.toString(r.nextInt(10));
            
        }
        return result;
    }
    
    public String authorGenerator(){
        //String[] p1 = {"luna", "sol", "campo", "laguna", "perros", "gatos", "saltamontes", "lapiz", "paredes" };
        //String[] p2 = {"de", "el", "la", "los", "las", "con", "sin"};
        //String[] p3 = {"luna", "sol", "campo", "laguna", "perros", "gatos", "saltamontes", "lapiz", "paredes" };
        String result = "";
        Random r = new Random();
        String[] p1 = {"Antonio", "Gloria"};
        String[] p3 = {"machado", "fuertes"};
        result = p1[r.nextInt(p1.length)] + p3[r.nextInt(p3.length)];
        return result;
    }
    
    public String tittleGenerator(){
        String result = "";
        Random r = new Random();
        String[] p1 = {"luna", "sol", "campo", "laguna", "perros", "gatos", "saltamontes", "lapiz", "paredes" };
        String[] p2 = {"de", "el", "la", "los", "las", "con", "sin"};
        String[] p3 = {"luna", "sol", "campo", "laguna", "perros", "gatos", "saltamontes", "lapiz", "paredes" };
        result = p1[r.nextInt(p1.length)] + p2[r.nextInt(p2.length)] +p3[r.nextInt(p3.length)];
        return result;
    }
    
    public double priceGenerator(){
        Random r = new Random();
        return r.nextDouble()*100;
    }
}
