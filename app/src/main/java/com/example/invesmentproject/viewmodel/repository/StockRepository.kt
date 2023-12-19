package com.example.invesmentproject.viewmodel.repository

import com.example.invesmentproject.model.repository.Portfolio
import com.example.invesmentproject.utils.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getPortfolio(
        fetchFromRemote: Boolean
    ): Flow<Resource<Portfolio>>
}