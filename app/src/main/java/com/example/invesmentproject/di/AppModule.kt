package com.example.invesmentproject.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.tinkoff.piapi.core.InvestApi
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /* TODO: DI */
}
@Module
object InvestApiClientModule {
    @Provides
    fun provideInvestApi(token: String): InvestApi {
        return InvestApi.createSandbox(token)
    }
}