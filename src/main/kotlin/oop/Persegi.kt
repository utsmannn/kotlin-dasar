package oop

open class Persegi {
    var sPanjang: Double = 0.0
    var sLebar: Double = 0.0

    constructor(lebar: Double, panjang: Double) {
        this.sLebar = lebar
        this.sPanjang = panjang
    }

    open fun luas(): Double {
        return sPanjang * sLebar
    }
}