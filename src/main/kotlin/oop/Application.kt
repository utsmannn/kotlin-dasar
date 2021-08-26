package oop

fun main(args: Array<String>) {
    hitungPersegiPanjang()
}

fun hitungPersegiPanjang() {
    val persegiPanjang = PersegiPanjang(5.0, 6.0)
    val lebar = persegiPanjang.getLebarPersegi()
    val panjang = persegiPanjang.getPanjangPersegi()
    println("lebar: $lebar")
    println("panjang: $panjang")

    val luas = persegiPanjang.luas()
    println("luas: $luas")
}

fun hitungDiameter() {
    println("input diameter: ")
    val diameter = readLine()?.toDoubleOrNull()
    if (diameter != null) {
        val lingkaran = Lingkaran(diameter = diameter)

        val luas = lingkaran.luas()
        val keliling = lingkaran.keliling()
        println("luas: $luas")
        println("keliling: $keliling")
    } else {
        println("input dengan nominal!")
        hitungDiameter()
    }
}