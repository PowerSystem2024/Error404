
package domain;


public class Persona {
    //Atributo de herencia
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    
    //Constructor vacio: este es para crear objetos sin necesidad de inicializar
    //los atributos de la clase
    public Persona() { //Constructor 1
        
        
    }
    
    public Persona(String nombre) { //Constructor 2
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
    
    
}
