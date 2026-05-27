package utils

object Validator {

    fun validatePositiveNumber(number: Double?): Boolean {

        return if(number != null) {
            number >= 0
        } else {
            false
        }
    }
}