/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author EL MEJOR
 */
public class AutoDeLujo extends Vehiculo {
    
    int cantidadDePasajeros;
    
    
    public AutoDeLujo(int cantidadDePasajeros, int númeroDeSerieDelMotor, String marca, int año, double precio) {
        super(númeroDeSerieDelMotor, marca, año, precio);
        this.cantidadDePasajeros = cantidadDePasajeros;
    }
    
    
    @Override
    public void ToString(){
      System.out.println();
      System.out.println("Tipo: Auto de Lujo");
      super.ToString();
      System.out.println("Cantidad de pasajeros: " + cantidadDePasajeros);
    }
    
    
}
