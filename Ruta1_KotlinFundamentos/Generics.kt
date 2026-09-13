// Codelab: Generics, objects, and extensions
// Se ejecuta en Kotlin Playground (https://play.kotlinlang.org)

// Clase genérica: T se reemplaza por el tipo real al crear la pregunta
// data class: genera toString(), equals(), hashCode(), copy() y componentN()
data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

// enum class: solo permite estos tres valores
enum class Difficulty {
    EASY, MEDIUM, HARD
}

// Interfaz: contrato que obliga a implementar progressText y printProgressBar()
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // Objeto acompañante (singleton dentro de la clase): se usa como Quiz.answered
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
    }

    // Funciones de alcance: let usa "it" para no repetir el nombre de la variable
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

// Paso 6 del codelab: propiedad y función de extensión sobre el objeto acompañante.
// Agregan funcionalidad sin modificar la clase original.
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}

fun main() {
    println("--- data class ---")
    println(Quiz().question1.toString())

    println("--- singleton / companion object ---")
    println("${Quiz.answered} of ${Quiz.total} answered.")

    println("--- extensiones (paso 6) ---")
    Quiz.printProgressBar()

    println("--- interfaz (paso 7) ---")
    Quiz().printProgressBar()

    println("--- funciones de alcance: let y apply (paso 8) ---")
    Quiz().apply {
        printQuiz()
    }
}
