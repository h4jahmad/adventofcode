package me.hajahmad.aoc.three.main

fun main() {
    DayOne().run()
}

class DayOne {

    fun run() {
        println(getPowerConsumption(DataSource.getInstance().getInput()))

    }

    private fun getPowerConsumption(input: List<IntArray>): Int {
        val epsilonRateBuilder = StringBuilder()
        val gammaRateBuilder = StringBuilder()
        val columnCount = input[0].size
        for(column in 0 until columnCount){
            var oneCount = 0
            for(row in input) oneCount += row[column]
            val isOneCommon = oneCount > (input.size / 2)

            gammaRateBuilder.append(if (isOneCommon) 1 else 0)
            epsilonRateBuilder.append(if (isOneCommon) 0 else 1)
        }
        val gammaRate = Integer.parseInt(gammaRateBuilder.toString(), 2)
        val epsilonRate = Integer.parseInt(epsilonRateBuilder.toString(), 2)
        return gammaRate * epsilonRate
    }

}