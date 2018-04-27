package com.noser.licensing

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class LicensingApplication

fun main(args : Array<String>) {
    SpringApplication.run(LicensingApplication::class.java, *args)
}