package com.example.helloworld
import kotlinx.android.synthetic.main.activity_main.*
fun main(){
    /*
    var myName = "Zensen" //mutable (cf. val = immutable)
    //TODO: I can directly move to TODO!
    print("Hello $myName\n")

    //number types
    val myByte:Byte = 12
    val myShort:Short = 125
    val myInt:Int = 123123123
    val myLong = 39_812_309_487_12_300

    val myFloat:Float = 13.37F
    val myDouble:Double = 3.1475489375987398

    //Boolean
    var isSunny: Boolean = true
    isSunny = false

    //Characters(type inference)
    val letterChar:Char = 'A'
    val digitChar:Char = '$'

    //Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length-1]

    print("First character $firstCharInStr\n")
    print("Last character $lastCharInStr\n")

    //Arithmetic operators(+, -, *, /, %)
    var result = 5+3
    result/=2
    val a = 5.0
    val b = 3
    var resultDouble:Double
    resultDouble = a/b
    print("result is $result\n")
    print("resultDouble is $resultDouble\n")

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    println("is -5 greater than or equal to 3? ${-5>=3}")

    //Assignment operators(+=, -=, *=, /=, %=)
    var myNum = 5
    myNum+=3
    myNum*=4
    println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is ${++myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    //if statements
    if(heightPerson1 > heightPerson2){
        println("use raw force")
    } else if(heightPerson1==heightPerson2){
        println("use your power technique 1337")
    } else{
        println("use technique")
    }

    val age = 17
    if(age>=21){
        println("now you may drink in US")
    }else if(age>=18){
        println("you may vote now")
    }else if(age>=16){
        println("you may drive now")
    }else{
        println("you are too young :(")
    }

    when(age){
        !in 0..20 ->{}
        in 18..20 ->{}
        16, 17 ->{}
        else->{}
    }

    var x : Any = 13.37
    when(x){
        is Int -> {}
        !is Double -> {}
        is String -> {}
        else -> {}
    }

    var name = "Zensen"

    if(name=="Zensen"){
        println("Welcome home Zensen")
    }else{
        println("Who are you?")
    }

    val isRainy = true
    if(isRainy) println("Bring your umbrella!")
    else println("It's not rain outside")

    //when expression
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    //while loop and do-while loop
    var xy = 1
    while(xy<=10){
        print("$xy")
        xy++
    }
    println("\nwhile loop is done")
    xy = 15
    do{
        xy++
        print("$xy")
    }while (xy <= 10)
    println("\ndo-while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while(feltTemp =="cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

    //for loop
    for(num in 1..10){
        print("$num ")
    }
    println()
    for(i in 1 until 10){
        print("$i ")
    }
    println()
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }
    println()

    //loop exercise
    for(i in 0..10000){
        if(i==9001) println("IT'S OVER 9000!!!")
    }

    var humidityLevel:Int = 80
    var humidity:String = "humid"
    while(humidity=="humid"){
        humidityLevel-=5
        if(humidityLevel<60){
            println("It's comfy now")
            humidity="comfy"
        }
    }
    */
    myFunction()
    var result = addUp(5, 3)
    println("result is $result")
    var avg = avg(5.3, 13.37)
    println("avg is $avg")

    //nullable

    //var name:String = "Zensen"
    //name = null -> Compilation ERROR
    var nullableName : String? = "Zensen"
    //nullableName = null

    //var len = name.length
    var len2 = nullableName?.length
    //println(nullableName?.toLowerCase())
    //println(nullableName?.toString())
    nullableName?.let{ println(it.length)}

    // ?: Elvis operator
    val name = nullableName ?: "Guest"
    println("name is $name")

    // nullableName!!.toLowerCase() -> null pointer exception
    println(nullableName!!.toLowerCase())

    //val age:String? = user?.lover?.age ?: 0
}
//function
fun myFunction(){
    println("Called from myFunction")
}
//Parameter(input)
fun addUp(a: Int, b: Int) : Int{
    return a+b
}
//Method - function within a class
fun avg(a:Double, b:Double):Double{
    return (a+b)/2
}