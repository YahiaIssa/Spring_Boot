package org.example

// في ملف Database.kt
interface Database {
    fun queryOrders(): List<String>
    fun insertOrder(order: String): Result<String> // إضافة Result
    fun deleteAllOrders()
}