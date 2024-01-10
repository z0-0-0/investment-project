package com.example.invesmentproject.brockerage

import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import kotlinx.serialization.json.Json
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RabbitSender @Inject constructor(
    rabbitClient: RabbitClient
) {
    val connection: Connection = rabbitClient.factory.newConnection("android.connection.publish")
    val channel: Channel = connection.createChannel()

    fun sendAuth(login: String, password: String) {
        val message: Json = Json.decodeFromString(login)
        channel.basicPublish("AuthAttempt", "user.auth", body =)
    }
}