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

                1 -> {
                    println("Opening Temperature Converter...")
                }

                2 -> {
                    println("Opening Length Converter...")
                }

                3 -> {
                    println("Opening Weight Converter...")
                }

                4 -> {
                    println("Opening Currency Converter...")
                }

                5 -> {
                    println("Goodbye")
                }

                else -> {
                    println("Invalid option")
                }
            }

        } while(option != 5)
    }
}