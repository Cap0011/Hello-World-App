package com.example.helloworld

interface Drivable{
    val maxSpeed:Double
    fun drive():String
    fun brake(){
        println("The drivable is braking")
    }
}
//Super, Parent, Base Class of ElectricCars
open class Cars(override val maxSpeed:Double, val name:String, val brand:String):Drivable{
    open var range:Double = 0.0

    fun extendRange(amount:Double){
        if(amount>0) range+=amount
    }
    open fun drive(distance:Double) {
        println("Drove for $distance Km");
    }

    override fun drive(): String = "driving the interface drive"
}
//Sub, Derived, Child Class of Cars
class ElectricCars(maxSpeed: Double,name: String, brand: String, batteryLife:Double):Cars(maxSpeed,name, brand){
    override var range = batteryLife*6
    var chargerType = "Type1"
    override fun drive(distance: Double) {
        println("Drove for $distance Km on electricity")
    }

    override fun drive():String="Drove for $range Km on electricity"

    override fun brake() {
        super.brake()
        println("brake: electricCar")
    }
}
abstract class Mammal(private val name:String, private val origin:String, private val weight:Double){ //Concrete(Non Abstract) Properties
    //Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed:Double

    //Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    //Concrete (Non Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name, origin, weight){
    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}
class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name, origin, weight){
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}
fun main(){
    var myCar = Cars(200.0,"A3", "Audi")
    var myECar = ElectricCars(240.0,"S-Model", "Tesla", 85.0)
    myECar.extendRange(200.0)

    myECar.drive()
    myECar.chargerType="Type2"

    //polymorphism
    myCar.drive(200.0)
    myECar.drive(200.0)

    myCar.brake()
    myECar.brake()

    val human = Human("Zensen","Korea",50.0, 10.0)
    val elephant = Elephant("Elly", "Africa", 5400.0, 30.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}