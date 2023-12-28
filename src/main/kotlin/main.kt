fun main() {
    val likes = 61

    val lastCharacter = likes % 10

    val people = if (lastCharacter == 1) "человеку" else "людям"

    println("Понравилось $likes $people")
}