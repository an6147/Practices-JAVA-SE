/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase10;

/**
 *
 * @author Cempai
 */
public class SecondHandsStore {
    private String name;
    private Product[] stock;

    public SecondHandsStore(String name, Product[] stock) {
        this.name = name;
        this.stock = stock;
        this.discount();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getStock() {
        return stock;
    }

    public void setStock(Product[] stock) {
        this.stock = stock;
    }
    
    public void printStatsProduct(){
        System.out.println("------------------------------------------");
        System.out.println("-----List Product second hands store--------");
        double benefits = 0.0;
        for(int i = 0; i < stock.length; i++){
            stock[i].printProduct();
            benefits += stock[i].getValue();
        }
        System.out.println("The profit the this store is: " + benefits);
        System.out.println("------------------------------------------");
    }
    
    public void discount(){
        for(int i = 0; i < stock.length-1; i++){
                if(stock[i].getType().compareTo("B") == 0){
                    stock[i].setValue(stock[i].getValue()*0.75);
                }
                if(stock[i].getType().compareTo("c") == 0){
                    stock[i].setValue(stock[i].getValue()*0.50);
                }
            }
    }
}
