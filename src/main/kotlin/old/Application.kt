package old

val contohString: String? = null


// tanda tanya, nerima value yang null-able
fun watcher(): String {
    val readable = readLine()
    return if (readable?.toIntOrNull() != null) {
        // integer
        watcher()
    } else {
        // string
        readable!!
    }
}

fun watcherOneChar(): String? {
    val readable = readLine()
    return if (readable?.toIntOrNull() != null) {
        // integer
        watcherOneChar()
    } else if (readable?.length == 1) {
        // string == 1 character
        readable
    } else {
        // string
        watcherOneChar()
    }
}

fun function1(): String = "sebuah string"

fun function2(a: String = "a", b: String, c: String = "c"): String {
    return a + b + c
}

fun function3(vararg nilai: Int): String {
    var current = 0
    for (angka in nilai) {
        current += angka
    }
    return "$current"
}

fun Int.sumOf(value: Int): Int {
    return this + value
}

fun String.removeLastChar(): String {
    return this.dropLast(1)
}

/*
fun hitungLuasBangunan(panjang: Int, Lebar: Int): Int {
    //
}*/

val binatang = "kucing"
//val isKucing: String = if (binatang == "kucing") "iya ini kucing" else "ini bukan kucing"

var isKucing: String = ""


fun whenControl(binatang: String) {
    when(binatang) {
        "kucing" -> println("ini kucing")
        "anjing" -> println("ini anjing")
        "kura-kura" -> println("ini kura-kura")
    }
}

fun forControl1() {
    for (i in 0..5) {
        println("ini index ke -> $i")
    }
}

fun forControl2() {
    for (i in 3 downTo 0) {
        println("ini index ke -> $i")
    }
}

fun forControl3() {
    for (i in 0..10 step 2) {
        println("ini index ke -> $i")
    }
}

fun forControl4() {
    val arrayBinatang = arrayListOf("kucing", "domba", "sapi", "semut", "anjing")
    for (binatang in arrayBinatang) {
        println("binatang nya adalah -> $binatang")
    }
}

fun main(args: Array<String>) {
    forControl4()
}
