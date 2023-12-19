package com.example.invesmentproject.brockerage

import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RabbitSender @Inject constructor(
    rabbitClient: RabbitClient
) {
    val connection: Connection = rabbitClient.factory.newConnection("android.connection.publish")
    val channel: Channel = connection.createChannel()

}