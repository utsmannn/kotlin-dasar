package oop

class PersegiPanjang : Persegi {
    private var panjang: Double = 0.0
    private var lebar: Double = 0.0

    constructor(lebar: Double) : super(lebar, lebar * 2) {
        this.lebar = super.sLebar
        this.panjang = super.sPanjang
    }

    constructor(lebar: Double, panjang: Double) : super(lebar, panjang) {
        this.lebar = super.sLebar
        this.panjang = super.sPanjang
    }

    fun getLebarPersegi() = lebar
    fun getPanjangPersegi() = panjang

    override fun luas(): Double {
        return super.luas() + 1
    }
}