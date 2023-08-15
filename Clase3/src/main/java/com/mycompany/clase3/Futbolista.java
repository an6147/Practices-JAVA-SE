package com.mycompany.clase3;

public class Futbolista {
    String nombre;
    String apellido;
    String DNI;
    String posición;
    double valor;
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getPosición() {
        return posición;
    }

    public double getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double multiplaDos(){
        return this.valor*2;
    }

    
    
    
}
