
package PasoPorValor;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambioValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        Persona persona2 = new Persona();
        persona2 = cambiarElValor(persona2);
    }
    
    public static  void cambiarValor(Persona persona) { //paso por referencia
        persona.nombre = "María";
        
    }
    
    public static Persona cambiarElValor(Persona persona) {
        if(persona == null) {
            System.out.println("Valor de persona es invalido : Null");
            return null;
            
        }
        else {
            persona.nombre = "Mónica";
        }
    }
}
