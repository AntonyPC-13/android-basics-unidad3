// Practice: Classes and Collections (app de seguimiento de eventos)
// Se ejecuta en Kotlin Playground (https://play.kotlinlang.org)

// Tarea 2: enum class para evitar "Morning", "morning" y "MORNING"
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

// Tarea 1: data class con descripción opcional (String? = null)
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

// Tarea 7: propiedad de extensión, sin modificar la data class
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main() {
    // Tarea 1
    val studyKotlin = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = Daypart.EVENING,
        durationInMinutes = 15
    )
    println(studyKotlin)

    // Tarea 3: todos los eventos en una sola lista mutable
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    println("Total events: ${events.size}")

    // Tarea 4: eventos cortos (menos de 60 minutos)
    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    // Tarea 5: resumen por parte del día
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, eventsInDaypart) ->
        println("$daypart: ${eventsInDaypart.size} events")
    }

    // Tarea 6: last() en vez de events[events.size - 1]
    println("Last event of the day: ${events.last().title}")

    // Tarea 7
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}
