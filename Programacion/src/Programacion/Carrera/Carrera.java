package Programacion.Carrera;
public class Carrera {
    private String Nombre;
    private String Modalidad;
public Carrera(){
    
}

public Carrera(String md){
Modalidad=md;
}
public Carrera(String md,String nombre){
Modalidad=md;
Nombre=nombre;
}
public String Obtener_modalidad (){
    return Modalidad;
}
public void Modifica_modalidad(String md){
Modalidad=md;
}
public String Obtener_nombre (){
    return Modalidad;
}
public void Modifica_nombre(String md){
Modalidad=md;
}

}

