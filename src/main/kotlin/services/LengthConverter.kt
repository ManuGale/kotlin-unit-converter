package services

class LengthConverter {

    fun metersToKilometers(meters: Double): Double {
        return meters / 1000
    }

    fun kilometersToMeters(km: Double): Double {
        return km * 1000
    }
}