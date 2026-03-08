package org.example

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class RestaurantOrderServiceTest {

    private lateinit var restaurantOrderService: RestaurantOrderService
    private val database: Database = mockk(relaxed = true) // relaxed=true ليقبل أي استدعاء log

    @BeforeEach
    fun setUp() {
        val dummyLogger: Logger = mockk()
        restaurantOrderService = RestaurantOrderService(dummyLogger, database)
    }

    @Test
     fun `clearOrders should delete all orders from data base when called`() {
        restaurantOrderService.clearOrders()

        verify(exactly = 1){database.deleteAllOrders()}
    }

}