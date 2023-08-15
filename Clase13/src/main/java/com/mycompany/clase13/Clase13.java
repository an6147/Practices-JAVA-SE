/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cempai
 */
public class Clase13 {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Library library = new Library();
        library.setName("My Library");
        BookGenerator gl = new BookGenerator();
        library.setStockBooks(gl.bookGenerator(15));
        String option ="";
        while(option.compareTo("8") != 0){
            showMenu();
            Scanner sc = new Scanner(System.in);
            option = sc.nextLine();
            switch(option){
                case "1":{
                    Session s = new Session();
                    library.setStockBooks(s.loadCatalogue());
                    break;
                }    
                case "2":{
                    Session s = new Session();
                    s.setCatalogue(library.getStockBooks());
                    s.saveCatalogue();
                    break;
                }    
                case "3":{
                    System.out.println("Escribe el ISBN");
                    String ISBN = sc.nextLine();
                    System.out.println("Escribe el titulo del libro");
                    String titulo = sc.nextLine();
                    System.out.println("Escribe el autor del libro");
                    String autor = sc.nextLine();
                    System.out.println("Escribe el precio del libro");
                    double precio = Double.parseDouble(sc.nextLine());
                    library.addBook(ISBN, titulo, autor, precio);
                    break;
                }                    
                case "4":{
                    System.out.println("Escribe el ISBN");
                    String ISBN = sc.nextLine();
                    library.deleteBook(ISBN);
                    break;
                }    
                case "5":{
                    System.out.println("Escribe el autor");
                    String autor = sc.nextLine();
                    library.authorFilter(autor);
                    break;
                }                    
                case "6":{
                    System.out.println("Escribe el precio");
                    double precio = Double.valueOf(sc.nextLine());
                    library.priceFilter(precio);
                    break;
                }                    
                case "7":{
                    library.printBooks();
                    break;
                }                    
                case "8":{
                    System.out.println("Hasta luego");
                    break;
                }                    
                default:{
                    System.out.println("Opcion incorrecta");
                    break;
                }
                
                            
            }
        }
        
    }
    
    public static void showMenu(){
        System.out.println("-------------Menú-----------");
        System.out.println("1.Cargar Catalogo");
        System.out.println("2.Guardar Catalogo");
        System.out.println("3.Añadir nuevo libro");
        System.out.println("4.Borrar libro del catalogo(ISNB)");
        System.out.println("5.Filtrar por auto");
        System.out.println("6.Filtrar por precio");
        System.out.println("7.Imprimir ");
        System.out.println("8.Salir");
    
    }
}
