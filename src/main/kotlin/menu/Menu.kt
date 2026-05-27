package menu

class Menu {

    fun showMainMenu() {

        var option: Int

        do {

            println("===== UNIT CONVERTER =====")
            println("1. Temperature")
            println("2. Length")
            println("3. Weight")
            println("4. Currency")
            println("5. Exit")

            print("Select an option: ")
            option = readln().toInt()

            when(option) {
                1 -> println("Temperature module")
                2 -> println("Length module")
                3 -> println("Weight module")
                4 -> println("Currency module")
                5 -> println("Goodbye")
                else -> println("Invalid option")
            }

        } while(option != 5)
    }
}