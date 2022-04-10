package me.hajahmad.aoc.three.main

import java.io.File
import java.util.Scanner


class DataRepository : DataSource {
    override fun getInput(): List<IntArray> {
        val intArray = mutableListOf<IntArray>()
        val scanner = Scanner(File(
            DataRepository::class.java.classLoader.getResource("input")!!.toURI()))
        val x = 1

        scanner.forEachRemaining { it -> intArray += it.chars().map { it - '0'.code }.toArray() }
        return intArray.toList()
    }

    fun test(){

    }

}