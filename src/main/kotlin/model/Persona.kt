package model

class Persona {
    var nombre: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var edad: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var cedula: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var sexo: Char = '\u0000'
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var peso: Float = 0.0f
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var altura: Float = 0.0f
        get() {
            return field
        }
        set(value) {
            field = value
        }


    constructor() {

    }

    constructor(nombrep: String, edadp: Int, sexop: Char) {
        this.nombre = nombrep
        this.edad = edadp
        this.sexo = sexop
    }

    constructor(nombrep: String, edadp: Int, sexop: Char, cedulap: String, pesop: Float, alturap: Float) {
        this.nombre = nombrep
        this.edad = edadp
        this.sexo = sexop
        this.cedula = cedulap
        this.peso = pesop
        this.altura = alturap
    }

}
