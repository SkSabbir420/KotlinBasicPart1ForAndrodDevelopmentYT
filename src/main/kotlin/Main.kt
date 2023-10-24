fun main(){

    /** Variable */
    val myName:String = "Sadik"
    val age:Int = 23
    val age2:Double = 2.3
    println("My name is $myName. $myName good in android development.")

    /** Conditional */
    val ageSabbir = 45
    if(ageSabbir<18){
        println("You are child")
    }else if(ageSabbir >= 18 && ageSabbir < 40){
        println("You are Adult")
    }else{
        println("You are Old")
    }

    /** Function */
//    val ageSabbir = 45
//    if(ageSabbir<18){
//        println("You are child")
//    }else if(ageSabbir >= 18 && ageSabbir < 40){
//        println("You are Adult")
//    }else{
//        println("You are Old")
//    }

//    val ageNahid = 12
//    if(ageNahid<18){
//        println("You are child")
//    }else if(ageNahid >= 18 && ageNahid < 40){
//        println("You are Adult")
//    }else{
//        println("You are Old")
//    }

    fun ageDefine(age:Int){
        if(age<18){
            println("You are child")
        }else if(age >= 18 && age < 40){
            println("You are Adult")
        }else{
            println("You are Old")
        }
    }
    ageDefine(age = 45)
    ageDefine(age = 12)

    /** Loop */
//    println(1)
//    println(2)
//    println(3)
//    println(100)

    var value = 1
    while (value <= 100){
        println(value)
        value = value + 1
    }

    /** Class and Object */

    class Iphone(modelName:String){

        val ram = 8
        val camera = 48
        var battery = 4000
        val modelName = modelName

        fun camera(){
            println("Capture Photo successfully")
        }
    }

    val Iphone15 = Iphone("Iphone 15")

    println( Iphone15.modelName)
    Iphone15.camera()

    println(Iphone15.battery)
    Iphone15.battery = 5000
    println(Iphone15.battery)




}