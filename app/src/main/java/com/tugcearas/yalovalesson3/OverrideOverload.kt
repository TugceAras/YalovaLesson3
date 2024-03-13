package com.tugcearas.yalovalesson3

// Function Overloading (Asiri yukleme) --> Iki veya daha fazla fonksiyonun ayn isme ancak farkli parametlere sahip olmasi anlamina gelir.

fun myFun (number1:Int){}
fun myFun (number1: Int, number2: Int){}
fun myFun (number1:Int, number2:Int, myString:String){}

//Override Ise (Gecersiz kilma) --> Ust siniftaki metodun alt sinifta gorevinin degistirilerek kullanilmasi durumudur. (draw icindeki print`lere dikkat)
// Ust sinif burada --> Shape, alt sinifta --> Circle
//Artik Circle sinifi icindeki draw metodu cagrildiginda "Sekil ciziliyor" degil de "Daire ciziliyor" ciktisi alinir. Cunku gorevini degistirdik.

open class Shape {
    open fun draw() {
        println("Sekil çiziliyor.")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Daire çiziliyor.")
    }
}