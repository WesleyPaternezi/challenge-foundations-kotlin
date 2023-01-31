package irrf

import RangeManager
import Rangeable

class IRRFCalculator() {

    fun calculateIRRF(salary: Double): Double {

        val irrfRanges: List<IRRFRange> = IRRFRangeManager.readFile("/faixasIRRF.txt")

        var irrfResult: Double = 0.0

        irrfRanges.forEach() { irrfRange ->
            if (salary >= irrfRange.minimumValue && salary <= irrfRange.maximumValue) {

                val applyRate = salary * (irrfRange.rate / 100)

                irrfResult = applyRate - irrfRange.deductableParcel

            }
        }
        return irrfResult
    }
}