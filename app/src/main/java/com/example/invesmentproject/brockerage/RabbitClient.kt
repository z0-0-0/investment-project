package com.example.invesmentproject.brockerage

import com.rabbitmq.client.ConnectionFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RabbitClient @Inject constructor() {
    val factory: ConnectionFactory = ConnectionFactory()
    fun createClient(factory: ConnectionFactory) {
        factory.apply {
            username = "guest"
            password = "guest"
            host = ConnectionFactory.DEFAULT_HOST
            virtualHost = ConnectionFactory.DEFAULT_VHOST
            port = ConnectionFactory.DEFAULT_AMQP_PORT
        }
    }
}