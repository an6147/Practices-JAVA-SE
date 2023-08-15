/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase8;

/**
 *
 * @author Cempai
 */
public class Clase8 {

    public static void main(String[] args) {
        Student[] conjuntoAlumnos= GeneradorAlumnos.generarAlumnos(20);
        
        Teacher p1 = new Teacher("Matematicas", "Juan", "perez", "123456");
        ClassRoom a1 = new ClassRoom(conjuntoAlumnos, p1, "ClassRoom 101");
        a1.printStudents();
        
        Teacher p2 = new Teacher("ingles", "Jhon", "SMITH", "001550");
        ClassRoom a2 = new ClassRoom(GeneradorAlumnos.generarAlumnos(20), p2, "ClassRoom 102");
        a2.printStudents();
        
        Teacher p3 = new Teacher("fisica", "timmy", "Proton", "001350");
        ClassRoom a3 = new ClassRoom(GeneradorAlumnos.generarAlumnos(20), p3, "ClassRoom 103");
        a2.printStudents();
        
        ClassRoom[] almacenaulas = new ClassRoom[3];
        almacenaulas[0] = a1;
        almacenaulas[1] = a2;
        almacenaulas[2] = a3;
        
        Director d1 = new Director(9.0, "Don", "Delinger", "1213695");
        
        School c1 = new School(almacenaulas, "ETRPA",d1 );
        c1.printStats();
    }
    
}
