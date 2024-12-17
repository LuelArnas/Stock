package com.cookandroid.stock.data.repository

import com.cookandroid.stock.data.network.StockApiService
import com.cookandroid.stock.data.model.StockResponse

class StockRepository(private val apiService: StockApiService) {
    suspend fun getStockData(symbol: String, apiKey: String): StockResponse {
        return apiService.getStockData("TIME_SERIES_DAILY", symbol, apiKey)
    }
}
