package com.codingdevs.demo.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin("*")
class HealthController {

    @GetMapping("/health")
    fun health(): String? {
        return "Health Check Ok"
    }

}