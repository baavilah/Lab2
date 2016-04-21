/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.aliens;

/**
 *
 * @author FamiliaOrjRod
 */
public class Alienigena {
    
    public int NumeroOjos;
    public int Numerovidas;
    public String Color;
    public int edad;
    public String nombre;

    public Alienigena() {
    }

    public Alienigena(int NumeroOjos, int Numerovidas, String Color, int edad, String nombre) {
        this.NumeroOjos = NumeroOjos;
        this.Numerovidas = Numerovidas;
        this.Color = Color;
        this.edad = edad;
        this.nombre = nombre;
    }

    

    
    public String toString(){
        
        System.out.println("Nombre : " + nombre + "   Numero de vidas : " + Numerovidas + "   Numero de ojos : " + NumeroOjos + "   Color: " + Color + "   Edad : " + edad);
        return null;
    }
    
}
