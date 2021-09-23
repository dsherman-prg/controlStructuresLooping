fun main(){
    var userInput = 0
    var userSelection = "x"

    do {
        // Print menu
        println("1) Small Cheeseburger")
        println("2) Frisco Angus Burger")
        println("3) Monster Angus Burger")
        println("4) Big Cheeseburger")
        println("5) Bacon & Cheese Angus Burger")
        println("6) Exit")
        // Get user input in as int
        userInput = readLine()!!.toInt()

        // Convert user selection to menu selection
        when(userInput){
            1 -> userSelection = "1) Small Cheeseburger"
            2 -> userSelection = "2) Frisco Angus Burger"
            3 -> userSelection = "3) Monster Angus Burger"
            4 -> userSelection = "4) Big Cheeseburger"
            5 -> userSelection = "5) Bacon & Cheese Angus Burger"
            6 -> userSelection = "6) Exit"
            !in 1..6 -> userSelection = "Invalid Entry. Please enter a valid selection."
        }

        // Print menu selection
        println("\nYou have selected:")
        println(userSelection)

    // Repeat program if non-valid input is entered
    }while (userInput !in 1..6)
}