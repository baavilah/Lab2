/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.banco;

/**
 *
 * @author FamiliaOrjRod
 */
public class Cuenta {
    public int cuenta;
    public double saldo;
    public String Nombre;

    public Cuenta(int cuenta, double saldo, String Nombre) {
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.Nombre = Nombre;
    }
    
    
    public void Depositar(double saldo){
        this.saldo+= saldo;
    }
    
    public void Retirar(double saldo){
        if(saldo < this.saldo){
            this.saldo-= saldo;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void ConsultarDatos(){
        System.out.println("Nombre propietario: " + Nombre + "   Saldo: " + saldo + "   Numero de cuenta: " + cuenta);
    }
    
}
