/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase10;

/**
 *
 * @author Cempai
 */
public class Clase10 {

    public static void main(String[] args) {
        Product[] lp = GeneradorProductos.generarProductos(1000);
        StoreManager sm = new StoreManager(lp);
        Product[] s1 = sm.prepareOrdersDowntownStore(100);
        Product[] s2 = sm.prepareOrdersSecondHandStore(150);
        DowntownStore t1 = new DowntownStore("EmpresaSoft",s1);
        SecondHandsStore t2 = new SecondHandsStore("Express", s2);
        sm.printListProduct();
        t1.printStatsProduct();
        t2.printStatsProduct();
    }
}
