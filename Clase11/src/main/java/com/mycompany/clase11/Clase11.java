/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase11;
import java.io.*;
/**
 *
 * @author Cempai
 */
public class Clase11 implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Person p1 = new Person();
       p1.setName("JUAN");
       p1.setLastName("PEREZ");
       
       FileOutputStream archivo = new FileOutputStream("object.dat");
       ObjectOutputStream salida = new ObjectOutputStream(archivo);
       salida.writeObject(p1);
       salida.close();
       
       FileInputStream archivo2 = new FileInputStream("object.dat");
       ObjectInputStream entrada = new ObjectInputStream(archivo2);
       Person recuperada = new Person();
       recuperada = (Person) entrada.readObject();
       System.out.println(recuperada.getName());
       entrada.close();
    }

}
