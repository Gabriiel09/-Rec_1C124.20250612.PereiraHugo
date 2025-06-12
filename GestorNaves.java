/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereirahugo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author BANGHO
 */

public class GestorNaves {
    private final List<Nave> naves = new ArrayList<>();
    
    public void agregarNave(Nave nueva){
        if(naves.contains(nueva)){
            System.out.println("Ya existe una nave con ese nombre y año de Lanzamiento");
        }else{
            naves.add(nueva);
            System.out.println("Nave agregada correctamente");
        }
    }
  
    
 public void mostrarNaves(){
     if(naves.isEmpty()){
         System.out.println(" No hay naves registradas. ");
     }else{
         for (Nave n: naves){
             System.out.println(n);
         }
     }
 }   
 public void iniciarExploracion() {
     for(Nave n: naves){
         n.iniciarExploracion();
     }
 }
  
 public void mostrarOrdenadasPornombres(){
     naves.stream()
             .sorted()
             .forEach(System.out::println);
 }
 
 public void mostrarOrdenadasPorTripulacion(){
     List<Nave> copia = new ArrayList<>(naves);
     copia.sort(new Comparator<Nave>(){
         public int compare(Nave a, Nave b){
             return b.getCapacidadTripulacion() - a.getCapacidadTripulacion();
         }
     });
     for (Nave n: copia){
         System.out.println();
     }
             
 }
 
}
