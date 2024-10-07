let x = 10; // variable de tipo primitiva
console.log(x.length);
console.log("Tipos primitivos");
// objeto
let persona = {
  nombre: "Carlos",
  apellido: " Gil",
  email: "cgil@gmail.com",
  edad: 30,
  nombreCompleto: function () {
    // metodo o funcion en JavaScript
    return this.nombre + " " + this.apellido;
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
