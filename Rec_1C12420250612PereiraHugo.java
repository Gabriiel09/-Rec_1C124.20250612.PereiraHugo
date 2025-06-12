/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_1c124.pkg20250612.pereirahugo;

import java.util.Scanner;

/**
 *
 * @author BANGHO
 */
public class Rec_1C12420250612PereiraHugo {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args, int option) {
        Scanner sc= new Scanner(System.in);
        GestorNaves gestor = new GestorNaves();
        int opcion;
        
        do{
            System.out.println(" \n--- MENU---");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar mision de exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por año de lanzamiento");
            System.out.println("6. Mostrar naves ordenadas por capacidad de tripulacion");
            System.out.println("7. Salir");
            System.out.println(" Elija una opcion");
            
            opcion= sc.nextInt();
            sc.nextLine();
            
            switch(option){
                
                case 1 -> {
                    System.out.println("tipo( 1=Exploracion, 2=Carguero, 3=Crucero");
                    int tipo= sc.nextInt(); sc.nextLine();
                    
                    System.out.println("Nombre");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Capacidad de Tripulacion: ");
                    int trip = sc.nextInt();
                    
                    System.out.println("Año de Lanzamiento");
                    int anio = sc.nextInt();
                    
                    
                    switch(tipo){
                        case 1:
                            System.out.println("Tipo de Mision(CARTOGRAFIA; INVESTIGACION; CONTACTO)");
                            sc.hasNextLine();
                            String mision = sc.nextLine();
                            gestor.agregarNave( new NaveExploracion(nombre, trip, anio, mision) {});
                            break;
                        case 2:
                            System.out.println("Capacidad de Carga");
                            int carga = sc.nextInt();
                            gestor.agregarNave(new Carguero(nombre, trip, anio, carga) {});
                        case 3:
                            System.out.println("Cantidad de pasajeros: ");
                            int pasajeros = sc.nextInt();
                            gestor.agregarNave(new CruceroEstelar(nombre, trip, anio, pasajeros) {});
                            break;
                        default:
                        System.out.println("Tipo invalido");
                        
                        
                        
                    } 
                    
                    break;
                    case 2:
                    gestor.mostrarNaves();
                    break;
                    case 3:
                    gestor.iniciarExploracion();
                    break;
                    case 4:
                    gestor.mostrarOrdenadasPorNombre();
                    break;
                    case 5:
                    gestor.mostrarOrdenadaPoAnio();
                    case 6:
                    gestor.mostrarordenadasPorTripulacion();
                    break;
                    case 7:
                    System.out.println(" Saliendo del Sistema...");
                    break;
                    default:
                    System.out.println(" Opcion Invalida");
                    
                    
                    
                    
                    
                
                    
                    
                    
                    
                    
                    
                    
            }
        }while(option!= 7);
    }
    
}
