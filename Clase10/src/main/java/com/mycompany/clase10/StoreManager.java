/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase10;

import java.util.ArrayList;

/**
 *
 * @author Cempai
 */
public class StoreManager {
    private Product[] store;

    public StoreManager() {
    }

    public StoreManager(Product[] store) {
        this.store = store;
    }
    
    

    public Product[] getStore() {
        return store;
    }

    public void setStore(Product[] store) {
        this.store = store;
    }
    
    public void sortWarehouseByValue(){
        Product aux = new Product();
        for(int i = 0; i < store.length-1; i++){
            for(int j = 0; j < store.length-i-1;j++)
                if(store[j].getValue() > store[j+1].getValue()){
                    aux = store[j];
                    store[j] = store[j+1];
                    store[j+1] = aux;
                }
        }
    }
    
        public void sortWarehouseByWeight(){
        Product aux = new Product();
        for(int i = 0; i < store.length-1; i++){
            for(int j = 0; j < store.length-i-1;j++)
                if(store[j].getWeight() > store[j+1].getWeight()){
                    aux = store[j];
                    store[j] = store[j+1];
                    store[j+1] = aux;
                }
        }
    }
    
    public Product SearchProductSec(String id){
        Product aux = new Product();
         for(int i = 0; i < store.length-1; i++){
            if(store[i].getID().compareTo(id) == 0){
                aux = store[i];
            }
        }
        return aux;
    }
    
    public Product SearchProductBinary(String id){
        int inf = 0;
        int sup = store.length-1;
        boolean encontrado = false;
        while((encontrado == false) && (sup >= inf)){
            int central = (inf+sup)/2;
            if(store[central].getID() == id){
                encontrado = true;
                return store[central];
            }else if (id.compareTo(store[central].getID()) > 0 ){
                inf = central+1;
            }else {
                sup = central-1;
            }
        }
        return null;
    }       
        
    public void printListProduct(){
        for(int i = 0; i < store.length; i++){
            store[i].printProduct();
        }
    
    }
    
    public Product[] prepareOrdersDowntownStore(int n){
        this.sortWarehouseByValue();
        ArrayList<Product> lStock = new ArrayList<Product>();
        int i = store.length-1;
        int j = 0;
        while((i >= 0) && (j < n)){
            if(store[i].getType().compareTo("A") == 0){
                lStock.add(store[i]);
                store[i].setAssigned(true);
                j++;
            }
            i--;
        }
        Product[] result = new Product[lStock.size()];
        lStock.toArray(result);
        return result;
    }
    
        public Product[] prepareOrdersSecondHandStore(int n){
        this.sortWarehouseByValue();
        ArrayList<Product> lStock = new ArrayList<Product>();
        int i = store.length-1;
        int j = 0;
        while((i >= 0) && (j < n)){
            if(store[i].getAssigned() == false){
                lStock.add(store[i]);
                store[i].setAssigned(true);
                j++;
            }
            i--;
        }
        Product[] result = new Product[lStock.size()];
        lStock.toArray(result);
        return result;
    }
    
}
