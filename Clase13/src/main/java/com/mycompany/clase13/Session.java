/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cempai
 */
public class Session {
    private ArrayList<Book> catalogue;

    public Session() {
    }

    public Session(ArrayList<Book> catalogue) {
        this.catalogue = catalogue;
    }

    public ArrayList<Book> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(ArrayList<Book> catalogue) {
        this.catalogue = catalogue;
    }
    
    public void saveCatalogue() throws FileNotFoundException, IOException{
        System.out.println("Write the file name");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        FileOutputStream writer = new FileOutputStream(fileName);
        ObjectOutputStream salida = new ObjectOutputStream(writer);
        salida.writeObject(catalogue);
        salida.close();
    }
    
        public ArrayList<Book> loadCatalogue() throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("Write the origin file name");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        FileInputStream reader = new FileInputStream(fileName);
        ObjectInputStream entrada = new ObjectInputStream(reader);
        ArrayList<Book> list = (ArrayList<Book>) entrada.readObject();
        return list;
    }
        
        
}
