package com.example.helloworld

import java.lang.IllegalArgumentException

data class User(val id:Long, var name: String)

fun main(){
    /*
    var adrian =  Person()
    var zensen = Person("Steve","Zensen", 21)
    zensen.hobby = "reading books"
    zensen.stateHobby()

    var myCar = Car()
    println("Brand is : ${myCar.brand}")
    myCar.maxSpeed = 888
*/
    var myPhone = MobilePhone("ios","Apple","iphone 12 mini")
    myPhone.chargeBattery(40)
    myPhone.chargeBattery(40)

    val user1 = User(1,"Steve")
    println(user1.name)
    user1.name = "Colt"

    val user2 = User(2,"Adrian")

    println(user1.equals(user2))
    println(user1==user2)

    val updateUser = user1.copy(name = "Steve Rogers")
    println(user1)
    println(updateUser)

    println(updateUser.component1())
    println(updateUser.component2())

    val(id, name) = updateUser
    println("id=$id, name=$name")
}
class Car(){
    lateinit var owner:String

    val brand:String = "BMW"
        //Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed:Int = 250
        //get() = field
        set(value) {
            field=if(value>0) value else throw IllegalArgumentException("Maxspeed cannot be less than 0")
        }

    var model:String="M5"
    private set

    init {
        this.model = "M3"
        this.owner="Frank"
    }
}
class Person (firstName: String = "Adrian", lastName: String= "Colt"){
    //Member Variables - Properties
    var age:Int? = null
    var hobby:String="Watcing Netflix"
    var firstName:String? = null
    var lastName:String? = null

    //Initializer Block
    init{
        this.firstName = firstName
        this.lastName = lastName
        println("Person Created! $firstName $lastName")
    }

    //Member secondary Constructor
    constructor(firstName: String, lastName: String, age:Int): this(firstName, lastName){
        this.age = age
        this.firstName = firstName
        this.lastName = lastName
        println("$firstName $lastName is $age years old!")
    }

    //Member Funtion - Methods
    fun stateHobby(){
        println("$firstName $lastName's hobby is $hobby!")
    }
}
class MobilePhone(osName:String, brand:String, model:String){
    var battery: Int = 50
    init {
        println("The phone $model from $brand uses $osName model as its Operating System")
    }
    fun chargeBattery(chargeBy:Int){
        print("Battery was ${battery}% before charging")
        battery+=chargeBy
        if(battery>100) battery=100
        println(" and now battery is ${battery}%")
    }
}