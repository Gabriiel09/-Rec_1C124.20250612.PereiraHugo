/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereirahugo;

 /**
 *
 * @author BANGHO
 */
import java.util.*;
import java.util.Objects;


abstract class Nave implements Comparable <Nave>{
    protected String nombre;
    protected int capacidadTripulacion;
    protected int anioLanzamiento;
    
    
    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento ){
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento  = anioLanzamiento;
    }
    
 public String getNombrre(){
     return nombre;
 }   
 
 public int getCapacidadTripulacion(){
     return capacidadTripulacion;
     
 }   
 public int getAnioLanzamiento(){
     return anioLanzamiento;
 }
 
 public abstract void iniciarExploracion();
 
 @Override
 public boolean equals(Object o){
     if(this == o) return true;
     if(!(o instanceof Nave)) return false;
     Nave nave = (Nave) o;
     return anioLanzamiento == nave.anioLanzamiento && Objects.equals(nombre.toLowerCase(), nave.nombre.toLowerCase());
     
     
     
 }
     
  @Override
  public int compareTo(Nave otra){
      return otra.anioLanzamiento - this.anioLanzamiento;
      
  }
 
  @Override 
  public String toString(){
      return String.format("Nombre: %s | Tripulacion: %d | Año:%d", nombre, capacidadTripulacion, anioLanzamiento);
  }
    
}
