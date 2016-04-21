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
public class Camioneta extends Vehiculo{
    
    int capacidadDeCarga;
    int cantidadDeEjes;
    int cantidadDeKilometrosRodados;

    public Camioneta(int capacidadDeCarga, int cantidadDeEjes, int cantidadDeKilometrosRodados, int númeroDeSerieDelMotor, String marca, int año, double precio) {
        super(númeroDeSerieDelMotor, marca, año, precio);
        this.capacidadDeCarga = capacidadDeCarga;
        this.cantidadDeEjes = cantidadDeEjes;
        this.cantidadDeKilometrosRodados = cantidadDeKilometrosRodados;
    }
    
    @Override
    public void ToString(){
      System.out.println();
      System.out.println("Tipo: Camioneta");
      super.ToString();
      System.out.println("Capacidad de carga: " + capacidadDeCarga);
      System.out.println("Cantidad de carga: " + cantidadDeEjes);
      System.out.println("Cantidad de kilometros rodados: " + cantidadDeKilometrosRodados);
    }
    
}
