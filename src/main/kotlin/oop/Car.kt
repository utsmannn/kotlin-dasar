package oop

class Car {

    private var name: String = ""
    private var color: String = ""

    fun setNameCar(name: String) {
        this.name = name
    }

    fun setColorCar(color: String) {
        this.color = color
    }

    fun getNameCar(): String {
        return name
    }

    fun getColorCar() = color

    fun getColorNameCar() = "$name - $color"
}