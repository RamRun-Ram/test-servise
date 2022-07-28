package com.example.testservise


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class TestServiseApplication

fun main(args: Array<String>) {
    runApplication<TestServiseApplication>(*args)
}