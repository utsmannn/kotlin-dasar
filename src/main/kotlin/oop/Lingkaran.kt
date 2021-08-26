package oop

class Lingkaran : BangunDatar {
    private var diameter: Double = 0.0

    constructor(diameter: Double) {
        this.diameter = diameter
    }

    constructor()

    init {
        // ini bakal dipanggil ketika class Lingkaran di create / di buat
        println("diameter diketahui = $diameter")
    }

    private var phi = Math.PI

    fun getDiameterLingkaran() = diameter

    override fun luas(): Double {
        return phi * (diameter * diameter) / 4
    }

    override fun keliling(): Double {
        return phi * diameter
    }
}