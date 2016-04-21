/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author brian
 */
import java.util.*;
public class Vegetariana extends Pizza {
    
    public Vegetariana(){
        masa = "Masa regular";
        ingredientes.add("Mozzarella");
        ingredientes.add("Parmesano rallado");
        ingredientes.add("Cebolla picada");
        ingredientes.add("Hongos en rebanadas");
        ingredientes.add("Pimienta roja en rodajas");
        ingredientes.add("Aceitunas negras rebanas");
        tiempoCoccion = 10;
        corte = "De la casa";
        empaque = "Fresco";
    } 
    
}
