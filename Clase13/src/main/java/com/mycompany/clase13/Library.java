/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cempai
 */
public class Library {
    
    private ArrayList<Book> stockBooks;
    private String name;

    public Library() {
    }

    public Library(ArrayList<Book> stockBooks, String name) {
        this.stockBooks = stockBooks;
        this.name = name;
    }

    public ArrayList<Book> getStockBooks() {
        return stockBooks;
    }

    public void setStockBooks(ArrayList<Book> stockBooks) {
        this.stockBooks = stockBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    public void addBook(String ISBN, String title, String author, double price){
        Book book = new Book(ISBN, title, author, price);
        stockBooks.add(book);
        
    }
    
    public void printBooks() throws IOException{
        System.out.println("Want save the book in a file?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        
        if(answer.compareToIgnoreCase("y") == 0){
            System.out.println("Write the file name");
            String fileName = sc.nextLine();
            
            FileWriter writer = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(writer);
            
            Iterator<Book> ib = stockBooks.iterator();
            while(ib.hasNext()){
                Book b1 = ib.next();
                b1.print(pw);
            }
            pw.close();
        }
        Iterator<Book> ib = stockBooks.iterator();
        while(ib.hasNext()){
            Book b1 = ib.next();
            b1.print();
        }
    }
    
    public Book deleteBook(String ISBM){
        boolean located = false;
        Iterator<Book> ib = stockBooks.iterator();
        while((ib.hasNext()) && (located == false)){
            Book b1 = ib.next();
            if(b1.getISBN().compareTo(ISBM) == 0){
                ib.remove();
                located = true;
                return b1;
            }
        }
        return null;
    }
    
    public ArrayList<Book> authorFilter(String author) throws IOException{
        ArrayList<Book> subList = new ArrayList<Book>();
        Iterator<Book> ib = stockBooks.iterator();
        while(ib.hasNext()){
            Book b1 = ib.next();
            if(b1.getAuthor().compareToIgnoreCase(author) == 0){
                subList.add(b1);
            }
        }
        System.out.println("You Want to save the book to a file?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        
        if(answer.compareToIgnoreCase("y") == 0){
            System.out.println("Write the file name");
            String fileName = sc.nextLine();
            
            FileWriter writer = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(writer);
            
            Iterator<Book> ib2 = subList.iterator();
            while(ib2.hasNext()){
                Book b1 = ib2.next();
                b1.print(pw);
            }
            pw.close();
        }
            Iterator<Book> ib3 = subList.iterator();
            while(ib3.hasNext()){
                Book b1 = ib3.next();
                b1.print();
            }
        return subList;
    }
    
        public ArrayList<Book> priceFilter(double price) throws IOException{
        ArrayList<Book> subList = new ArrayList<Book>();
        Iterator<Book> ib = stockBooks.iterator();
        while(ib.hasNext()){
            Book b1 = ib.next();
            if(b1.getPrice() <= price){
                subList.add(b1);
            }
        }
        System.out.println("You Want to save the book to a file?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        
        if(answer.compareToIgnoreCase("y") == 0){
            System.out.println("Write the file name");
            String fileName = sc.nextLine();
            
            FileWriter writer = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(writer);
            
            Iterator<Book> ib2 = subList.iterator();
            while(ib2.hasNext()){
                Book b1 = ib2.next();
                b1.print(pw);
            }
            pw.close();
        }
            Iterator<Book> ib3 = subList.iterator();
            while(ib3.hasNext()){
                Book b1 = ib3.next();
                b1.print();
            }
        return subList;
    }
}
