package com.example.Spring_boot_basics_kotlin1.repository

import com.example.Spring_boot_basics_kotlin1.QuoteDtio

class QuotesRepository {
   private val quotes=mutableListOf<QuoteDtio>()

    fun getQoutes()= quotes

    fun inserQuote(quote: QuoteDtio):QuoteDtio{
        quotes.add(quote)
        return quote
    }
    fun updateQuote(quote: QuoteDtio):QuoteDtio{
        val index=quotes.indexOfFirst { it.id == quote.id }
        quotes[index]=quote
        return quote
    }
    fun deleteQuotes(quotesId: Long): Boolean{
        val qoutesToDelete=quotes.find { it .id==quotesId }
       return if(qoutesToDelete!=null){
            quotes.remove(qoutesToDelete)
             true
        }else
             false

    }
}