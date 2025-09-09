package com.tun.alouatta

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform