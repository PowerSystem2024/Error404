//let persona3 = new Persona("Carla", "Ponce"); esto no se puede hacer: Persona is not defined

class Persona {
  //clase padre

  static contadorPersona = 0; //atributo estatico
  //email = "Valor default email"; //Atributo no estatico

  static get MAX_OBJ() {
    return 5;
  }
  constructor(nombre, apellido) {
    this._nombre = nombre;
    this._apellido = apellido;
    if (Persona.contadorPersona < Persona.MAX_OBJ) {
      this.idPersona = ++Persona.contadorPersona;
    } else {
      console.log("Se ha superado el maximo de objetos permitidos");
    }
    this.idPersona = ++Persona.contadorPersona;
    //console.log("Se incrementa el contador: " + Persona.contadorObjetoPersona);
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
    return this.idPersona + " " + this._nombre + " " + this._apellido;
  }
  //sobreescribiendo el metodo de la clase padre (Object)
  toString() {
    // regresa un string
    //se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
    // el metodo que se ejecuta depende si en una referencia de un tipo de padre o hija
    return this.nombreCompleto();
  }

  static saludar() {
    console.log("Saludos desde este metodo static");
  }
  static saluda2(persona) {
    console.log(persona.nombre + " " + persona.apellido);
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

//persona1.saludar(); no se utiliza desde el objeto
Persona.saludar();
Persona.saluda2(persona1);

Empleado.saludar();
Empleado.saluda2();

//console.log(persona1.contadorObjetoPersona);
console.log(Persona.contadorObjetoPersona);
console.log(Empleado.contadorObjetoPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); no se puede acceder desde la clase
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersona);

let persona3 = new Persona("Carla", "Pertosi");
console.log(persona3.toString());
console.log(Persona.contadorPersona);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; //no se puede modificiar ni alterar
console.log(Persona.MAX_OBJ);

let persona4 = new Persona("Franco", "Diaz");
console.log(persona4.toString());
let persona5 = new Persona("Lilina", "Paz");
console.log(persona5.toString());
