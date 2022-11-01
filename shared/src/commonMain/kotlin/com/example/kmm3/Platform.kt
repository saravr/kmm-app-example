package com.example.kmm3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform