package services

class LengthConverter {

    private val lengths = listOf("Meters", "Kilometers", "Miles")

    fun showUnits() {
        lengths.map {
            println(it)
        }
    }

    fun metersToKilometers(meters: Double): Double {
        return meters / 1000
    }

    fun kilometersToMeters(km: Double): Double {
        return km * 1000
    }

    fun metersToMiles(meters: Double): Double {
        return meters / 1609
    }

    fun milesToMeters(miles: Double): Double {
        return miles * 1609
    }
}