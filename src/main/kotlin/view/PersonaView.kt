package view
import controller.PersonaController
import java.util.Scanner
import model.Persona
import view.PersonaView

class PersonaView (){
    var pc=PersonaController()

fun Pedirdatos():Persona{
    val read = Scanner(System.`in`)
    println("Ingrese el nombre de la persona: ")
    var nombre = readLine()!!
    println("Ingrese la edad de "+nombre+" :")
    var edad = Integer.valueOf(readLine())
    println("Ingrese el sexo de "+nombre+" :")

    var sexo = readLine()!![0]
    if(!pc.combrobarSexo(sexo)){
        sexo='H'
    }
    println("Ingrese el peso de "+nombre+" :(Utilice la coma para los decimales)")
    var peso =  read.nextFloat()
    println("Ingrese la altura de "+nombre+" (Utilice la coma para los decimales):")
    var altura =  read.nextFloat()
    println("Ingrese la cedula de "+nombre+" :")
    var cedula= readLine()!!
    var persona=Persona(nombre,edad,sexo,cedula,peso,altura)
    return persona
}

    fun imprimirPersona(persona:Persona){
        println(pc.ToString(persona))
    }

    fun Main(){
        //objeto 1 pide los datos al usuario
        var persona0=Pedirdatos()
        //objeto 2 toma los datos anteriores sin el peso y la altura
        var persona1=Persona(persona0.nombre,persona0.edad,persona0.sexo)
        //objeto 3 se instancia por defecto y se le setean los valores
        var persona2=Persona()
        persona2.sexo='M'
        persona2.nombre="Maria"
        persona2.altura= 1.5F
        persona2.peso=90F
        persona2.cedula="182939485"
        persona2.edad=23
        imprimirPersona(persona0)
        imprimirPersona(persona1)
        imprimirPersona(persona2)
    }
}