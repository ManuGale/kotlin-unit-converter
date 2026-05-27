package services

class WeightConverter {

    fun kilogramsToGrams(kg: Double): Double {
        return kg * 1000
    }

    fun gramsToKilograms(grams: Double): Double {
        return grams / 1000
    }
}
