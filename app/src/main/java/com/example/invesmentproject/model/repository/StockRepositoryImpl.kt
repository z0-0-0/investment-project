package com.example.invesmentproject.model.repository

import com.example.invesmentproject.brockerage.RabbitConsumer
import com.example.invesmentproject.brockerage.RabbitSender
import com.example.invesmentproject.utils.Resource
import com.example.invesmentproject.viewmodel.repository.StockRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StockRepositoryImpl @Inject constructor(
    rabbitSender: RabbitSender,
    rabbitConsumer: RabbitConsumer
) : StockRepository {
    override suspend fun getPortfolio(fetchFromRemote: Boolean): Flow<Resource<Portfolio>> {
        return flow {
            emit(Resource.Loading(true))
            val portfolio =
        }
    }
}

