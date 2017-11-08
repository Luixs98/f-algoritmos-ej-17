/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
  private double sueldo;
   
  
public Profesor (double s){
super("Rene","Elizalde",34);
      setsueldo(s);
}
public Profesor(String n,String ape, int ed, double s){  
        super(n,ape,ed);
        setsueldo(s);       
}
public Profesor(){
    super("Alexandre","Bermeo",27);
    setsueldo(345.3);
}  
public void setEdad(int e){
         if (e<30){
             edad = 30;
         }else{
             edad = e;
         }
    }
public void setsueldo(double s){
      sueldo = s;
}
public double obtener_sueldo(){
return sueldo;
}
}