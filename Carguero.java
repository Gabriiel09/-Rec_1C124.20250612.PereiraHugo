/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereirahugo;

/**
 *
 * @author BANGHO
 */
public abstract class Carguero extends Nave{
    private int capacidadCarga;
    
    public Carguero(String nombre, int capacidadTripulacion, int anioLanzamiento, int carga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = Math.max(100, Math.min(500, capacidadCarga));
        
    }
@Override 
public void iniciarExploracion(){
    System.out.println("El carguero"+ nombre + " inicia una mision logistica con" + capacidadCarga + " toneladas. ");
    
}
    
@Override
public String toString(){
    return super.toString()+ " | Capacidad de Carga: "+ capacidadCarga + " toneladas ";
    
}
        
}


