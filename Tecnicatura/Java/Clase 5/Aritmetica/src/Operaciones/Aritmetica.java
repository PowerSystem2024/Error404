
package Operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodo
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("El resultado = " + resultado);
    }
    
    
    public int sumarConRetorno() {
        //int resultado = a + ;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b) {
       this.a = arg1; //El argumento a se asigna al atributo this.a
       this.b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
