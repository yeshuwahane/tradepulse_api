package com.tradepulse.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import com.tradepulse.routes.*

fun Application.configureRouting() {
    routing {
        authRouting()
        productRouting()
    }
}
