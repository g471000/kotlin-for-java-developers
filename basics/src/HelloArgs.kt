fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

fun main(args: Array<String>) {
    println("First ${foo()}, second ${foo()}")
}