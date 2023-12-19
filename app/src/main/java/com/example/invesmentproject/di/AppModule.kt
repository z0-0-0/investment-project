package com.example.invesmentproject.di

import com.example.invesmentproject.brockerage.RabbitClient
import com.rabbitmq.client.ConnectionFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRabbitClient(): RabbitClient {
        fun createClient(factory: ConnectionFactory = ConnectionFactory()) {
            factory.apply {
                username = "guest"
                password = "guest"
                host = ConnectionFactory.DEFAULT_HOST
                virtualHost = ConnectionFactory.DEFAULT_VHOST
                port = ConnectionFactory.DEFAULT_AMQP_PORT
            }
        }

        return provideRabbitClient().createClient(factory = ConnectionFactory())
    }


}