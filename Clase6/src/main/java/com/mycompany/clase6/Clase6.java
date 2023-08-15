/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cempai
 */
public class Clase6 {

    public static void main(String[] args) {
        int ramdon = (int)Math.random() * (5-1)+5;
        String cadena;
        int numAttemts = 0;
        int number = -1;
        boolean end = false;
        
        BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
        do{
            try{
                System.out.println("Write a number: ");
                cadena = keyboard.readLine();
                number = Integer.parseInt(cadena);
            
            }catch(IOException e){
                System.out.println("IO ERROR");
            }catch(NumberFormatException e){
                System.out.println("Format error");
            }finally{
                numAttemts++;
                if(ramdon == number){
                    end = true;
                }
            }
        
        }while(end == false);
            System.out.println("Number correct: " + number + " attemts: " + numAttemts);
    }
}
