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
public class Cheques extends Cuenta{
    
    private double ComisionPorUsoC;
    private double ComisionECSI;

    public Cheques(int cuenta, double saldo, String Nombre) {
        super(cuenta, saldo, Nombre);
    }

    //ECSI = emision de cheques con saldo isuficiente
    @Override
        public void Retirar(double saldo){
        if(saldo < this.saldo){
            this.saldo-= saldo;
            this.saldo = this.saldo-(this.saldo*ComisionPorUsoC);
        }else {
            System.out.println("Saldo insuficiente");
            this.saldo = this.saldo-(this.saldo*ComisionECSI);
        }
    }

    public void setComisionPorUsoC(double ComisionPorUsoC) {
        this.ComisionPorUsoC = ComisionPorUsoC;
    }

    public void setComisionECSI(double ComisionECSI) {
        this.ComisionECSI = ComisionECSI;
    }
    
    
    
}
