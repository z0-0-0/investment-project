package com.example.invesmentproject.brockerage

import com.rabbitmq.client.ConnectionFactory
import javax.inject.Singleton

@Singleton
interface RabbitClient {
    val factory: ConnectionFactory
    fun createClient(factory: ConnectionFactory): RabbitClient
}