/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.banco;
import java.util.Date;
/**
 *
 * @author FamiliaOrjRod
 */
public class Ahorros extends Cuenta{
    
    Date Fecha = new Date();
    //La fecha de vencimiento queda automaticamente 1 año después de la creación de la cuenta
    private Date FechaVencimiento = new Date((Fecha.getYear()+1), Fecha.getMonth(), Fecha.getDay());
    private double PorcentajeDeInteres;

    public Ahorros(int cuenta, double saldo, String Nombre) {
        super(cuenta, saldo, Nombre);
    }
    
    
    
    

public void DepositarInteres(){
    if(Fecha.getDay()==1){
        this.saldo+= this.saldo*PorcentajeDeInteres;
    } else {
        System.out.println("Acción sólo permitida para el primer día de cada mes");
        
    }
}


    @Override
    public void Retirar(double retiro){
    if( (Fecha.getYear()==FechaVencimiento.getYear()) && (Fecha.getMonth()==FechaVencimiento.getMonth()) && (Fecha.getDay()==FechaVencimiento.getDay())){
        this.saldo-= retiro;
    }else {
        System.out.println("Acción sólo permitida para la fecha de vencimiento");
        
    }
}

    public void setPorcentajeDeInteres(double PorcentajeDeInteres) {
        this.PorcentajeDeInteres = PorcentajeDeInteres;
    }
    
    
    
}
