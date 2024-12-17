package com.cookandroid.stock.data.model

data class StockResponse(
    val metaData: MetaData,
    val timeSeries: Map<String, StockData>
)

data class MetaData(
    val information: String,
    val symbol: String,
    val lastRefreshed: String
)

data class StockData(
    val open: String,
    val high: String,
    val low: String,
    val close: String,
    val volume: String
)
