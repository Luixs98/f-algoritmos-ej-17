/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author reroes
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    protected int edad;
    
    public Persona(String n, String a,  int e){
        setNombre(n);
        setApellido(a);
        setEdad(e);
    }
    
    public void setNombre(String n){
        nombre = n;
    }
     public String getNombre(){
        return nombre;
    }
    public void setApellido(String a){
        apellido = a;
    }
     public String getApellido(){
        return apellido;
    }
    public void setEdad(int e){
        edad = e;
    }
    
    public int getEdad(){
        return edad;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s - Apellido %s - Edad %d", 
                getNombre(), getApellido(), getEdad());
    }
    
    
}
