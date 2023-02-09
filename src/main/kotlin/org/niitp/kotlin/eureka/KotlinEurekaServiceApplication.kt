package org.niitp.kotlin.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class KotlinEurekaServiceApplication

fun main(args: Array<String>) {
    runApplication<KotlinEurekaServiceApplication>(*args)
}
