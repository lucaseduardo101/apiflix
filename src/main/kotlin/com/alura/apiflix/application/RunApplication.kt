package com.alura.apiflix.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(value = ["com.alura.apiflix"])
open class RunApplication

fun main(args: Array<String>){
    runApplication<RunApplication>(*args)
}