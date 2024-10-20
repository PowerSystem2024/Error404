
package domain;


public class Persona {
    //Atributo de herencia
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    
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
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
    
    
}
