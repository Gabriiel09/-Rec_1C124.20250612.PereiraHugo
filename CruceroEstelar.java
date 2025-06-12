/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereirahugo;

/**
 *
 * @author BANGHO
 */
public abstract class CruceroEstelar  extends Nave{
    private int cantidadPasajeros;

    public CruceroEstelar(String nombre, int capacidadTripulacion, int anioLanzamiento, int pasajeros) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
        
    }
 
 @Override
 public void iniciarExploracion(){
     System.out.println(" El crucero estelar " + nombre + "no participa en misiones de exploracion");
 }
 
 @Override
 public String toString(){
     return super.toString() + " | Pasajeros: " + cantidadPasajeros;
 }
    
}
