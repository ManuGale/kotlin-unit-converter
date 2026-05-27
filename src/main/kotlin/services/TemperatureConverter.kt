package services

class TemperatureConverter {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return (celsius * 9/5) + 32
    }
}