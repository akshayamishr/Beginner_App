package com.example.appoftheday2.concepts

interface Vehicle{

    fun fly(){

    }

    fun move(){

    }
}

class Car( var position: Int) : Vehicle{
    override fun move(){
        position += 1
    }
}

class Aeroplane(var position : Int) : Vehicle{
    override fun fly(){
        position += 5
    }
}

interface Operation{
    fun perform(a:Int, b:Int) : Int
}

class Multiply : Operation{
    override fun perform(a: Int, b: Int): Int {
        return a*b
    }

}

fun calculate(op: Operation,a:Int,b:Int) : Int{
    return op.perform(a,b)
}

// Lambda function
val sum: (Int,Int)->Int = {
    a,b -> a+b
}

object InterfaceConcept {
    //
    @JvmStatic
    fun main(args: Array<String>) {
        val multiplyop = Multiply()
        val result = calculate(multiplyop,2,3)
        println("Result : $result")

        val addition = sum(2,3)
        println("Addition : $addition")
    }
}