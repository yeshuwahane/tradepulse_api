package com.tradepulse

import com.tradepulse.plugins.configureDatabase
import com.tradepulse.plugins.configureMonitoring
import com.tradepulse.plugins.configureRouting
import com.tradepulse.plugins.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 8080
    embeddedServer(Netty, port = port, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureDatabase()
    configureMonitoring()
    configureSerialization()
    configureRouting()
}
