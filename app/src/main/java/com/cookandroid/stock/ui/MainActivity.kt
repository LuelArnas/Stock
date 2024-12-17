package com.cookandroid.stock.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import androidx.activity.viewModels
import com.cookandroid.stock.R
import com.cookandroid.stock.viewmodel.StockViewModel

import androidx.activity.viewModels
import com.cookandroid.stock.data.network.RetrofitInstance
import com.cookandroid.stock.data.repository.StockRepository

import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {

    // ViewModel 초기화
    private val stockViewModel: StockViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ViewModel 사용 예시
        stockViewModel.getStockData()
    }
}


