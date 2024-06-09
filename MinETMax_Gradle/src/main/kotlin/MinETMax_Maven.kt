import java.util.Scanner

fun findMax(numbers: List<Long>): Long {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun findMin(numbers: List<Long>): Long {
    var min = numbers[0]
    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return min
}

fun main() {
    val scanner = Scanner(System.`in`)
    val numbers = mutableListOf<Long>()

    println("Enter numbers one by one, pressing Enter after each. Type 'done' to finish:")
    while (scanner.hasNext()) {
        if (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong())
        } else {
            val input = scanner.next()
            if (input.equals("done", ignoreCase = true)) {
                break
            } else {
                println("Invalid input. Please enter a long integer or 'done' to finish.")
            }
        }
    }

    if (numbers.isNotEmpty()) {
        val max = findMax(numbers)
        val min = findMin(numbers)
        println("Original List: $numbers")
        println("Maximum: $max")
        println("Minimum: $min")
    } else {
        println("No numbers entered.")
    }

    scanner.close()
}
