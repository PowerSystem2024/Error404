//Paso por referencia
package pasoporreferencia;

import  Clases.Persona;

public class PasoPorReferencia {
    public static void main(String [] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";   
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1);
        persona1 = cambioElValor(persona1);
        Persona persona2 = new Persona();
        //Persona Persona2 = null;
        persona2 = cambioElValor(persona2);
        System.out.println("El nuevo valor del objeto es: "+persona2.nombre);
    }
    
    public static void cambioValor(Persona persona) { //parámetro por referencia
        persona.nombre = "Maria";
    }
    
    public static Persona cambioElValor(Persona persona) {
        if(persona == null) {
            System.out.println("Valor de persona es invalido: Null");
            return null;
        }
        else{
            persona.nombre = "Mónica";
            return persona;
        }
        
    }
    
}
    
