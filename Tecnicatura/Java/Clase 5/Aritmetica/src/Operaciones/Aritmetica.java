
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
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
