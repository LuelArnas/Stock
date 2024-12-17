package com.cookandroid.stock.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.cookandroid.stock.data.repository.StockRepository

class StockViewModel(private val repository: StockRepository) : ViewModel() {

    // symbol과 apiKey에 기본값을 지정합니다.
    fun getStockData(
        symbol: String = "AAPL",
        apiKey: String = "YOUR_API_KEY"
    ) = liveData {
        try {
            val response = repository.getStockData(symbol, apiKey)
            emit(response)
        } catch (e: Exception) {
            emit(null)
        }
    }
}




