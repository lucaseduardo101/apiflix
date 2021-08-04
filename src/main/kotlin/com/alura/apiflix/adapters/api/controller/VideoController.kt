package com.alura.apiflix.adapters.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VideoController {

    @GetMapping("/videos")
    fun getVideos():String{
        return "Solicitacao recebida"
    }
}