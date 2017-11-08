/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;

/**
 *
 * @author Usuario
 */
public class Asignatura {
private String nombre;
private String tipo ;
private double costo ;  

public Asignatura(String n, String t,int c){
    setNombre(n);
    settipo(t);
    setcosto(c);
}
public void setNombre(String n){
nombre = n;
}
public String getNombre(){
    return nombre; 
}
public void settipo(String t){
tipo = t;
}
public String gettipo(){
    return tipo; 
}
public void setcosto(double c){
costo = c;
}
public double getcosto(){
    return costo ; 
}
 @Override
    public String toString(){
        return String.format("Nombre: %s - tipo %s - costo %f", 
                getNombre(), gettipo(), getcosto());
}

}



