package com.example.Spring_boot_basics_kotlin1

import com.example.Spring_boot_basics_kotlin1.service.QuotesService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
@RestController
@RequestMapping("/qoutes")
class QuoteController(
    private val quotesService:QuotesService
) {
     val qoutes=mutableListOf<QuoteDtio>()

    @GetMapping
    fun lodeQuotes(
        @RequestParam(value = "Q", required = false) query: String?,
    ): List<QuoteDtio>{
    return quotesService.getQoutes()
    }

    @PostMapping
    fun postQuotes(
        @RequestBody qoutesdto:QuoteDtio
    ): QuoteDtio{
    return quotesService.insertQuote(qoutesdto)
    }
    @PutMapping
    fun putQuote(
        @RequestBody qouteDto: QuoteDtio
    ): QuoteDtio{
        val index = qoutes.indexOfFirst{it.id == qouteDto.id}
        qoutes[index] = qouteDto

        return qouteDto
    }

    @DeleteMapping("/{id}")
    fun deleteQuote(
        @PathVariable ("id") id: Long
    ){
       val qouteToDelete =qoutes.find{ it.id == id}
         if (qouteToDelete != null) {
            qoutes.remove(qouteToDelete)
        }else{
            throw QoutesNotFoundException(id)
        }

    }
}