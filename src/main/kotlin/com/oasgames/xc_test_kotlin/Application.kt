package com.oasgames.xc_test_kotlin

import io.ktor.application.*
import com.oasgames.xc_test_kotlin.plugins.*

fun main(args: Array<String>): Unit =
        io.ktor.server.netty.EngineMain.main(args)

/**
 * Please note that you can use any other name instead of *module*.
 * Also note that you can have more then one modules in your application.
 * */
@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    configureRouting()
    configureSecurity()
}
