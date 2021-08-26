package oop

class Segitiga : BangunDatar() {
    private var alas: Double = 0.0
    private var tinggi: Double = 0.0

    fun setAlasSegitiga(alas: Double) {
        this.alas = alas
    }

    fun setTinggiSegitiga(tinggi: Double) {
        this.tinggi = tinggi
    }

    fun getAlasSegitiga() = alas
    fun getTinggiSegitiga() = tinggi

    override fun luas(): Double {
        return (alas * tinggi) / 2
    }

    override fun keliling(): Double {
        TODO()
    }
}