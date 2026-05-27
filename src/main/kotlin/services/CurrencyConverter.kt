package services

class CurrencyConverter {

    fun usdToMxn(usd: Double): Double {
        return usd * 18.5
    }

    fun mxnToUsd(mxn: Double): Double {
        return mxn / 18.5
    }

    fun eurToMxn(eur: Double): Double {
        return eur * 21.0
    }

    fun mxnToEur(mxn: Double): Double {
        return mxn / 21.0
    }
}