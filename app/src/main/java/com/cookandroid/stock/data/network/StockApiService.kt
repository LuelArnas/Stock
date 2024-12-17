package com.cookandroid.stock.data.network
import com.cookandroid.stock.data.model.StockResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApiService {
    @GET("query")
    suspend fun getStockData(
        @Query("function") function: String,
        @Query("symbol") symbol: String,
        @Query("apikey") apiKey: String
    ): StockResponse
}