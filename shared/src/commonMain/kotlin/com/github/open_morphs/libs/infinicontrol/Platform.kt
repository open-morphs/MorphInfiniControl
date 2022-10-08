package com.github.open_morphs.libs.infinicontrol

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform