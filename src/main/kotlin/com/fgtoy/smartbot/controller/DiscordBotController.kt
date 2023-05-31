package com.fgtoy.smartbot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class DiscordBotController {
    @GetMapping("/{id}")
    fun getId(@PathVariable id: String): String {
        return id
    }
}
