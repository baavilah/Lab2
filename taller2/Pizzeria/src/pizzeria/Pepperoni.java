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
public class Pepperoni extends Pizza {

    public Pepperoni() {
        masa = "Masa regular";
        ingredientes.add("Rodajas de pepperoni");
        ingredientes.add("Parmesano rallado");
        ingredientes.add("Rodajas de cebolla");
        tiempoCoccion = 7;
        corte = "Europeo";
        empaque = "Fresco";
    }
    
}
