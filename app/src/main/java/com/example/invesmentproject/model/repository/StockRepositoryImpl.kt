package com.example.invesmentproject.model.repository

import com.example.invesmentproject.brockerage.RabbitConsumer
import com.example.invesmentproject.brockerage.RabbitSender
import com.example.invesmentproject.utils.Resource
import com.example.invesmentproject.viewmodel.repository.StockRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StockRepositoryImpl @Inject constructor(
    rabbitSender: RabbitSender,
    rabbitConsumer: RabbitConsumer,
) : StockRepository {
    override suspend fun getPortfolio(fetchFromRemote: Boolean): Flow<Resource<Portfolio>> {
        val _portfolio = MutableStateFlow<Resource<Portfolio?>>(Resource.Success(null))
        val portfolio: StateFlow<Resource<Portfolio?>> = _portfolio
        return flow {
            emit(Resource.Loading(true))

            portfolio.collectLatest { message ->
                _portfolio.value = message
            }

            emit(Resource.Success(portfolio.value.data))
        }
    }
}

