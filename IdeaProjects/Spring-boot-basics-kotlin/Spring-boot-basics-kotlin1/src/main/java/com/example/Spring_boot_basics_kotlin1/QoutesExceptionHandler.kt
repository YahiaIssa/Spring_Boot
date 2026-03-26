package com.example.Spring_boot_basics_kotlin1
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class QoutesExceptionHandler {
    @ExceptionHandler(QoutesNotFoundException::class)
    fun onQouteNotFound(e: QoutesNotFoundException)=mapOf(
        "errorCode" to "Qoute not found",
        "message" to e.message
    )
}