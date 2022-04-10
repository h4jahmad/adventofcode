package me.hajahmad.aoc.three.main

interface DataSource {
    fun getInput(): List<IntArray>

    companion object {
        private var dataRepository: DataRepository? = null

        fun getInstance(): DataSource {
            if (dataRepository == null) dataRepository = DataRepository()
            return dataRepository!!
        }
    }
}