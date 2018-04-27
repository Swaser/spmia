package com.noser.confsrv

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
open class ConfigServerApplication

fun main(args : Array<String>) {
    SpringApplication.run(ConfigServerApplication::class.java, *args)
}