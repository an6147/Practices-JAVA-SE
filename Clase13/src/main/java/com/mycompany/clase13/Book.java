/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase13;

import java.io.PrintWriter;
import java.io.Serializable;
import java.text.DecimalFormat;

/**
 *
 * @author Cempai
 */
public class Book implements Serializable{
    private String ISBN;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void print(){
        DecimalFormat decimales = new DecimalFormat("00.00");
        System.out.println("ISBN: " + this.getISBN() + " title: " + this.getTitle() + " author: " + this.getAuthor() + " price: " + decimales.format(this.getPrice())+"$USD");
    }
    
    public void print(PrintWriter salida){
        DecimalFormat decimales = new DecimalFormat("00.00");
        salida.println("ISBN: " + this.getISBN() + " title: " + this.getTitle() + " author: " + this.getAuthor() + " price: " + decimales.format(this.getPrice())+"$USD");
    }
}
