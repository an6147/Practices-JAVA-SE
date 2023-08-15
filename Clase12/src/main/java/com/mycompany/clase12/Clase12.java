/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase12;

import static com.mycompany.clase12.GeneradorProductos.generarProductos;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Cempai
 */
public class Clase12 {

    public static void main(String[] args) {
        Product p1 = new Product();
        ArrayList<Product> lproduc = GeneradorProductos.generarProductos(10);
        
        Iterator<Product> ite = lproduc.iterator();
        int i = 0;
        while(ite.hasNext()){
            if(i == 4){
                ite.remove();
            }else{
                ite.next().print();
                System.out.println("Iteración: " + i);
            }

            i++;
        }
        
    }
}
