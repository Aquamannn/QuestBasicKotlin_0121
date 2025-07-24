package com.example.test

import java.util.*

fun main() {
    // List
    // List adalah koleksi terurut dari item. List dapat berisi duplikat.
    // List bersifat read-only secara default, artinya item tidak dapat ditambahkan atau dihapus setelah dibuat.
    // MutableList adalah List yang dapat dimodifikasi.

    println("// List")
    val readOnlyList = listOf("Apple", "Banana", "Cherry")
    println(readOnlyList)

    val mutableList = mutableListOf("Circle", "Square", "Triangle")
    println(mutableList)

    // Menambahkan data ke dalam List Mutable
    mutableList.add("Rectangle")
    println(mutableList)

    // Mengakses data di dalam List
    println(readOnlyList[0])
    println(mutableList[1])

    // Mengupdate data di dalam List Mutable
    mutableList[0] = "Oval"
    println(mutableList)

    // Menghapus data di dalam List Mutable
    mutableList.removeAt(1) // Menghapus item pada indeks 1 (Square)
    mutableList.remove("Triangle") // Menghapus item "Triangle"
    println(mutableList)

    // Set
    // Set adalah kumpulan data unik (tidak ada duplikat) dan tidak terurut.
    // Set bersifat read-only secara default, artinya item tidak dapat ditambahkan atau dihapus setelah dibuat.
    // MutableSet adalah Set yang dapat dimodifikasi.

    println("\n// Set")
    val readOnlySet = setOf("Apple", "Banana", "Cherry", "Apple") // "Apple" hanya akan muncul sekali
    println(readOnlySet)

    val mutableSet = mutableSetOf("Circle", "Square", "Triangle")
    println(mutableSet)

    // Menambahkan data ke dalam Set Mutable
    mutableSet.add("Rectangle")
    println(mutableSet)

    // Menghapus data di dalam Set Mutable
    mutableSet.remove("Circle")
    println(mutableSet)

    // Map
    // Map adalah koleksi item yang disimpan dalam pasangan kunci-nilai. Kunci harus unik, tetapi nilai bisa duplikat.
    // Map bersifat read-only secara default, artinya item tidak dapat ditambahkan atau dihapus setelah dibuat.
    // MutableMap adalah Map yang dapat dimodifikasi.

    println("\n// Map")
    val readOnlyMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(readOnlyMap)

    val mutableMap = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(mutableMap)

    // Menambahkan data ke dalam Map Mutable
    mutableMap["Rectangle"] = 4
    println(mutableMap)

    // Mengakses data di dalam Map
    println(readOnlyMap["one"])
    println(mutableMap["Circle"])

    // Mengupdate data di dalam Map Mutable
    mutableMap["Circle"] = 0
    println(mutableMap)

    // Menghapus data di dalam Map Mutable
    mutableMap.remove("Square")
    println(mutableMap)

    // Contoh penggunaan isEmpty()
    println("\n// Contoh isEmpty()")
    val emptyList = emptyList<String>()
    println(emptyList.isEmpty()) // true

    val nonEmptyList = listOf("a")
    println(nonEmptyList.isEmpty()) // false

    // Contoh penggunaan size()
    println("\n// Contoh size()")
    println(readOnlyList.size) // 3
    println(mutableList.size) // 2
    println(readOnlySet.size) // 3
    println(mutableSet.size) // 3
    println(readOnlyMap.size) // 3
    println(mutableMap.size) // 3

    // Contoh penggunaan contains()
    println("\n// Contoh contains()")
    println(readOnlyList.contains("Banana")) // true
    println(readOnlySet.contains("Apple")) // true
    println(readOnlyMap.containsKey("two")) // true
    println(readOnlyMap.containsValue(3)) // true
}