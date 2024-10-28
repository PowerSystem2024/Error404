class Cliente extends Persona {
  static contadorCliente = 0;

  constructor(nombre, apellido, edad, fecharegistro) {
    super(nombre, apellido, edad);
    this._idCliente = ++Cliente.contadorCliente;
    this._fecharegistro = fecharegistro;
  }

  get idCliente() {
    return this._idCliente;
  }
  get fecharegistro() {
    return this._fecharegistro;
  }

  toString() {
    return `${super.toString()}${this._idCliente}${this._fecharegistro}`;
  }
}
