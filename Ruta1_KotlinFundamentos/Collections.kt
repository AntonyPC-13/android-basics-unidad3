// Codelab: Use collections in Kotlin
// Se ejecuta en Kotlin Playground (https://play.kotlinlang.org)

fun main() {
    arrays()
    lists()
    sets()
    maps()
}

// Array: tamaño fijo, acceso por índice (empieza en 0)
fun arrays() {
    println("=== Arrays ===")
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets

    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    solarSystem[3] = "Little Earth"
    println(solarSystem[3])

    // solarSystem[8] = "Pluto"
    // Lanza ArrayIndexOutOfBoundsException: el array solo tiene 8 posiciones (0 a 7)

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem[8])
}

// List: ordenada y de solo lectura. MutableList: permite agregar, cambiar y quitar
fun lists() {
    println("=== List ===")
    val readOnlySolarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(readOnlySolarSystem.size)
    println(readOnlySolarSystem[2])
    println(readOnlySolarSystem.get(3))
    println(readOnlySolarSystem.indexOf("Earth"))
    println(readOnlySolarSystem.indexOf("Pluto"))

    for (planet in readOnlySolarSystem) {
        println(planet)
    }

    println("=== MutableList ===")
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])

    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")
    println(solarSystem.contains("Pluto"))
    println("Future Moon" in solarSystem)
}

// Set: sin orden y sin duplicados (usa hashCode)
fun sets() {
    println("=== MutableSet ===")
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))

    solarSystem.add("Pluto") // no se agrega: ya existe
    println(solarSystem.size)

    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
}

// Map: pares clave-valor, las claves son únicas
fun maps() {
    println("=== MutableMap ===")
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia")) // null: la clave no existe

    solarSystem.remove("Pluto")
    println(solarSystem.size)

    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])
}
