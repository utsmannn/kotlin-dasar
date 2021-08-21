fun main(args: Array<String>) {

    val array = Array(4) { index ->
        index * 3
    }

    array.forEach {
        //println(it)
    }

    val file1 = File1()
    file1.defineInner()
    val nama = file1.inner?.nama
    println(nama)
}