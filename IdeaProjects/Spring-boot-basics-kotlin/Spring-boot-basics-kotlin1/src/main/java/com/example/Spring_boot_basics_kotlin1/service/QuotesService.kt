package com.example.Spring_boot_basics_kotlin1.service

import com.example.Spring_boot_basics_kotlin1.QuoteDtio
import com.example.Spring_boot_basics_kotlin1.repository.QuotesRepository

class QuotesService(val quotesRepository: QuotesRepository) {
    fun getQoutes()=quotesRepository.getQoutes()
    fun insertQuote(quote: QuoteDtio) :QuoteDtio{
        return quotesRepository.inserQuote(quote)
    }
    fun updateQuote(quote: QuoteDtio):QuoteDtio{
        return quotesRepository.updateQuote(quote)
    }
    fun deleteAllQuotes(quotesId: Long){
       quotesRepository.deleteQuotes(quotesId)
        }
}