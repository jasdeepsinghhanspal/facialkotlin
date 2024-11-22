import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val enrolledUsers = mutableMapOf<String, String>() 

    while (true) {
        println("Welcome to Facial Recognition System")
        println("Select an option:")
        println("1. Enroll a new user")
        println("2. Check if user is enrolled")
        println("3. Exit")

        when (scanner.nextInt()) {
            1 -> enrollUser(scanner, enrolledUsers)
            2 -> checkUser(scanner, enrolledUsers)
            3 -> {
                println("Exiting...")
                break
            }
            else -> println("Invalid option. Please try again.")
        }
    }
}

fun enrollUser(scanner: Scanner, enrolledUsers: MutableMap<String, String>) {
    println("Enter user ID to enroll:")
    val userId = scanner.next()
    
    if (enrolledUsers.containsKey(userId)) {
        println("User already enrolled with ID: $userId")
        return
    }

    println("Simulating facial data capture...")
    
    val faceData = "facial_data" 

    enrolledUsers[userId] = faceData
    println("User enrolled successfully with ID: $userId")
}

fun checkUser(scanner: Scanner, enrolledUsers: Map<String, String>) {
    println("Enter user ID to check:")
    val userId = scanner.next()

    if (enrolledUsers.containsKey(userId)) {
        println("User with ID $userId is already enrolled.")
        println("Facial data: ${enrolledUsers[userId]}")
    } else {
        println("No user found with ID: $userId")
    }
}
