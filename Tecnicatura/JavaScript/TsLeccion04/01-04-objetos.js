let x = 10; // variable de tipo primitiva
console.log(x.length);
console.log("Tipos primitivos");
// objeto
let persona = {
  nombre: "Carlos",
  apellido: " Gil",
  email: "cgil@gmail.com",
  edad: 28,
  idioma: "ES",
  get lang() {
    return this.idioma.toUpperCase(); // convierte las minusculas a mayusculas
  },
  set lang(lang) {
    this.idioma = lang.toUpperCase();
  },
  nombreCompleto: function () {
    // metodo o funcion en JavaScript
    return this.nombre + " " + this.apellido;
  },
  get nombreEdad() {
    // este es el metodo Get
    return "el nombre es " + this.nombre + ", Edad " + this.edad;
  },
};

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 14";
persona2.telefono = "592618282821";
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto");
console.log(persona["apellido"]);
console.log("Usamos el ciclo for in");
// for in
for (propiedad in persona) {
  console.log(propiedad);
  console.log(persona[propiedad]);
}
console.log("Cambiamos y eliminamos un error");
persona.apellida = "Betancud"; //cambiamos dinamicamente un valor del objeto
delete persona.apellida; // eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log(persona.nombre + "," + persona.apellido);

//numero 2: a travez del ciclo for in
for (nombrePropiedad in persona) {
  console.log(persona[nombrePropiedad]);
}

//numero 3: la funcion Object.values()
console.log("Distintas formas de imprimir un objeto: forma 3");
let personaArray = Object.values(persona);
console.log(personaArray);

//numero 4: utilizaremos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto: forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log(persona.nombreEdad);

console.log("comenzamos con el metodo get para los idiomas");
persona.lang = "en";
console.log(persona.lang);

function persona3(nombre, apellido, email) {
  //constructor
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  this.nombreCompleto = function () {
    return this.nombre + " " + this.apellido;
  };
}
let padre = new persona3("Leo", "Lopez", "lopezl@gmail.com");
padre.nombre = "Luis";
console.log(padre);
console.log(padre.nombreCompleto());
let madre = new persona3("Laura", "Contreras", "contrerasl@gmail.com");
console.log(madre);
console.log(madre.nombreCompleto());

//diferentes formas de crear objetos
//caso objeto 1
let miObjeto = new Object(); //Esta es una opcion formal
//caso objeto 2
let miObjeto2 = {}; //esta opcion es breve y recomendad

//caso string 1
let miCadena1 = new String("Hola"); //sintaxis formal
//caso string 2
let miCadena2 = "Hola"; // esta es la sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero1 = new Number(1); // es formal no recomendable
//caso con numeros 2
let miNumero2 = 1; //sintaxis recomendada

//caso boolean 1
let miBooleano1 = new Boolean(false); //formal
//caso boolean 2
let miBooleano2 = false; //sintaxis recomendada

//caso Arreglos 1
let miArreglo1 = new Array(); //formal
//caso Arreglos 2
let miArreglo2 = []; //sintaxis recomendada

//caso function 1
let miFunction1 = new (function () {})(); // todo despues de new es considerado objeto
//caso function 2
let miFunction2 = function () {}; //notacion simplificada y recomendada

//Usp de protorype
persona3.prototype.telefono = "261838383832";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "54261838383832";
console.log(madre.telefono);

// uso de call

let persona4 = {
  nombre: "Juan",
  apellido: "Perez",
  nombreCompleto2: function (titulo, telefono) {
    return titulo + ":" + this.nombre + " " + this.apellido + " " + telefono;
  },
};

let persona5 = {
  nombre: "Carlos",
  apellido: " Lara",
};

console.log(persona4.nombreCompleto2("Lic.", "542618484845"));
console.log(persona4.nombreCompleto2.call(persona5, "Ing.", "542618484846"));

//Metodo aplly
let arreglo = ["Ing.", "54926186868686"];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
