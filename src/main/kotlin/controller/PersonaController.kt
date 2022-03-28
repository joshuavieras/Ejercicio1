package controller
import model.Persona
class PersonaController (){
    
    fun CalcularIMC(persona:Persona): Int {
        var pesoideal = (persona.peso) / (persona.altura  * persona.altura)
        if(persona.peso<pesoideal){
            return -1
        }else if(persona.peso>pesoideal){
            return 1
        }
        return 0
    }
    fun esMayorDeEdad(persona:Persona):Boolean{
        if(persona.edad>17){
            return true
        }else{
            return false
        }
    }
    fun combrobarSexo(sexo:Char):Boolean{
        if(sexo!='H'||sexo!='M'){
            return false
        }else{
            return true
        }
    }
    fun ToString(persona:Persona):String{
        var x:String="";
        x+="Nombre: "+persona.nombre+"\n"
        x+="Edad: "+persona.edad+"\n"
        if(esMayorDeEdad(persona)){
            x+=persona.nombre+" es mayor de edad\n"
        }else{
            x+=persona.nombre+" es menor de edad\n"
        }
        x+="Cédula: "+persona.cedula+"\n"
        x+="Sexo: "+persona.sexo+"\n"
        x+="Peso: "+persona.peso+"\n"
        x+="Altura: "+persona.altura+"\n"

        if(CalcularIMC(persona)==-1){
            x+=persona.nombre+" está debajo de su peso ideal\n"
        }else if(CalcularIMC(persona)==0){
            x+=persona.nombre+" tiene un peso ideal\n"
        }else if(CalcularIMC(persona)==1){
            x+=persona.nombre+" tiene sobrepeso\n"
        }
        return x
    }
}
