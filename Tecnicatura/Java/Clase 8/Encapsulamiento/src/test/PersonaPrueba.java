
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.00, false);
        System.out.println("persona1 = " + persona1);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //Modificar a través de los métodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio";//Ya no se puede utilizar
        //System.out.println("Nombre es: "+persona1.nombre);//Error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo es: "+persona1.getSueldo()); 
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        
        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //y imprimir, luego modificar sus valores y volver a imprimir
        Persona persona2 = new Persona("Sebastian", 45.00, true);
        System.out.println("persona2 su nombre es: "+persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo es: "+persona2.getSueldo()); 
        System.out.println("persona2 para obtener el booleano: "+persona2.isEliminado());
        
        //Modificando los valores
        persona2.setNombre("Ariel");
        persona2.setSueldo(50.00);
        persona2.setEliminado(false);
        
        System.out.println("persona2 con su nombre modificado: "+persona2.getNombre());
        System.out.println("persona2 el sueldo modificado es: "+persona2.getSueldo()); 
        System.out.println("persona2 el booleano modificado es: "+persona2.isEliminado());
        
        System.out.println("persona1 = " + persona1);
    } 
}
