package services

class LengthConverter {

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