/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

import java.util.Random;

/**
 *
 * @author Cempai
 */
public class GeneradorAlumnos {
    public static Student[] generarAlumnos(int n){
        String[] lnombres = {"Juan","Jose","ernesto","miku","acosta","luz","freskys","diego","antonio"};
        String[] lapellidos = {"kant","resyes","jimenez","perez","mendoza","smith","parra","suarez","rojas"};
        String[] lcursos = {"primero", "segundo", "tercero", "cuarto"};
        Student[] conjuntoAlumnos = new Student[n];
        
            for(int i = 0; i < n; i++){
                Random r = new Random();
                int inombre = r.nextInt(lnombres.length);
                int iapellido = r.nextInt(lapellidos.length);
                
                String dni = Integer.toString((int) (Math.random()*1000000));
                double notamedia = r.nextDouble()*10;
                int icurso = r.nextInt(4);
                
                Student nuevoAlumno = new Student(lcursos[icurso], notamedia, lnombres[inombre], lapellidos[iapellido],dni);
                if( i == 0){
                    ComanderCourse d1 = new ComanderCourse(5.0, lcursos[icurso], notamedia, lnombres[inombre], lapellidos[iapellido], dni);
                    conjuntoAlumnos[i] = d1;
                }else{
                    conjuntoAlumnos[i] = nuevoAlumno;
                }
            }
            return conjuntoAlumnos;
    }
    
}
