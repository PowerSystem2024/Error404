//let persona3 = new Persona("Carla", "Ponce"); esto no se puede hacer: Persona is not defined

class Persona {
  //clase padre
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
  }
  get nombre() {
    return this._nombre;
  }
  set nombre(nombre) {
    this._nombre = nombre;
  }
  get apellido() {
    return this._apellido;
  }
  set apellido(apellido) {
    this._apellido = apellido;
  }
}

class Empleado extends Persona {
  //clase hija
  constructor(nombre, apellido, departamento) {
    super(nombre, apellido);
    this._departamento = departamento;
  }
  get departamento() {
    return this._departamento;
  }
  set departamento(departamento) {
    this._departamento = departamento;
  }
  nombreCompleto() {
    return this._nombre + " " + this._apellido;
  }
  //sobreescribiendo el metodo de la clase padre (Object)
  toString() {
    // regresa un string
    //se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
    // el metodo que se ejecuta depende si en una referencia de un tipo de padre o hija
    return this.nombreCompleto();
  }
}

let persona1 = new Persona("Martin", "Perez");
console.log(persona1.nombre);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);
//console.log(persona1)
let persona2 = new Persona("Carlos", "Lara");
console.log(persona2.nombre);
persona2.nombre = "Maria Laura";
//console.log(persona2)

let empleado1 = new Empleado("Maria", "Gimenez", "Sistema");
console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString Esta es la manera correcta de acceder a los atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());
