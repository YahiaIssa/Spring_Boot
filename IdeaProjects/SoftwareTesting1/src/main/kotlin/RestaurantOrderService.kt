package org.example

class RestaurantOrderService(
    private val logger: Logger,
    private val database:Database
) {
    fun addOrder(order: String) {
        if (order.isBlank()) {
            logger.log("Failed to add order")
            throw IllegalArgumentException()
        }
        val insertResult=database.insertOrder(order)

        when{
            insertResult.isSuccess->showMessage("Success")
            insertResult.isFailure->showMessage("Fail")
        }
    }
    fun showMessage(message: String) {
        println(message)
    }
    fun getOrders(): List<String> {
        return database.queryOrders()
    }
    fun clearOrders() {
        database.deleteAllOrders()
    }
}