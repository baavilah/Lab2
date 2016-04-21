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
public class Vehiculo {
    
    protected int númeroDeSerieDelMotor;
    protected String marca;
    protected int año;
    protected double precio;
 

    public Vehiculo(int númeroDeSerieDelMotor, String marca, int año, double precio) {
        this.númeroDeSerieDelMotor = númeroDeSerieDelMotor;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }
    
    
    
    public  void ToString (){
        System.out.println("Número de serie del motor: " + númeroDeSerieDelMotor);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }
}
