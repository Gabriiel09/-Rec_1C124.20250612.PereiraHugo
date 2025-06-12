/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereirahugo;

/**
 *
 * @author BANGHO
 */
public abstract class NaveExploracion extends Nave {
    private String tipoMision;

    public NaveExploracion(String nombre, int capacidadTripulacion, int anioLanzamiento, String mision) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision.toUpperCase();
    }
 
 @Override
 public void iniciarExploracion(){
     System.out.println("La nave de exploracion"+ nombre + "inicia su mision de " + tipoMision);
 }
 
 @Override
 public String toString(){
     return super.toString() + " | Tipo de Mision " + tipoMision;
     
 }
 
}
