package services

class WeightConverter {

    fun kilogramsToGrams(kg: Double): Double {
        return kg * 1000
    }

    fun gramsToKilograms(grams: Double): Double {
        return grams / 1000
    }

    fun kilogramsToPounds(kg: Double): Double {
        return kg * 2.20462
    }

    fun poundsToKilograms(pounds: Double): Double {
        return pounds / 2.20462
    }
}
