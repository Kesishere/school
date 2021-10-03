package com.kes.school

var list = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
var str = arrayOf("a", "b", "c", "d", "e")


fun main() {
    var a: Int = 2
    var b: Int = 0
    val numbList: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var strList: Array<String> = arrayOf("a", "b", "c", "d", "e", "f", "g")
   /* println(plus(a, b))
    println(minus(a, b))
    println(multiplied(a, b))
    println(division(a, b))
    println(name("Nickolay", "Dmitrievich", "Kaznacheev"))*/
    println(sumArray(numbList))
    println(mixList(strList).toList().toString())
}

fun plus(a : Int, b : Int):Int {
    return a + b
}

fun minus(a : Int, b : Int) : Int{
    return a - b
}

fun multiplied(a : Int, b : Int) : Int{
    return a * b
}

fun division(a : Int, b : Int) : String{
    return if(b == 0){
          "На ноль делить нельзя!"
    }else{
        (a.toDouble() / b.toDouble()).toString()
    }
}

fun name(firstname : String, surname: String, lastname: String): String{
    return "$firstname $surname $lastname"
}

fun sumArray(numbList: Array<Int>): Int{
    var sum: Int = 0
    for (i in numbList){
        sum += i
    }
    return sum
}

fun mixList(strList: Array<String>): Array<String>{
    var element1: Int = 0
    var element2: Int = 0
    for (i in strList.indices){
        if (strList[i] == "c") element1 = i
        if (strList[i] == "d") element2 = i
    }
    strList[element1] = "d"
    strList[element2] = "c"
    return strList
}