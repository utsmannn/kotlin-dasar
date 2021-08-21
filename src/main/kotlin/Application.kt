fun watcher(): String? {
    val readable = readLine()
    return if (readable?.toIntOrNull() != null) {
        // integer
        watcher()
    } else {
        // string
        readable
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

fun main(args: Array<String>) {
    val result1 = "utsman"
    val result2 = result1.removeLastChar()
    println(result2)
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

fun hitungLuasBangunan(panjang: Int, Lebar: Int): Int {
    //
}