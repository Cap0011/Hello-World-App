package com.example.helloworld

fun main(){
    var list:ArrayList<Double> = ArrayList<Double>(5)
    list.add(1.0)
    list.add(2.0)
    list.add(3.0)
    list.add(4.0)
    list.add(5.0)
    var sum:Double= 0.0
    for(i in list){
        sum+=i
    }
    println(sum/5)
}