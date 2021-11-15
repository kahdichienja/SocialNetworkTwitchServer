package com.plcoding

import com.plcoding.di.mainModule
import com.plcoding.plugins.*
import io.ktor.application.*
import org.koin.ktor.ext.Koin
import java.nio.file.Paths

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    install(Koin) {
        modules(mainModule)
    }
    configureSecurity()
    configureSockets()
    configureSessions()
    configureRouting()
    configureHTTP()
    configureMonitoring()
    configureSerialization()
}
