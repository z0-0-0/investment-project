package com.example.invesmentproject.brockerage

import com.rabbitmq.client.AMQP
import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import com.rabbitmq.client.Consumer
import com.rabbitmq.client.Envelope
import com.rabbitmq.client.ShutdownSignalException
import javax.inject.Inject
import javax.inject.Singleton

private val QUEUE_NAME = "portfolio.answer"

@Singleton
class RabbitConsumer @Inject constructor(
    rabbitClient: RabbitClient
) {
    val connection: Connection = rabbitClient.factory.newConnection("android.connection.consume")
    val channel: Channel = connection.createChannel()

    fun consumeCreate() {
        val autoAck = false
        channel.basicConsume(QUEUE_NAME, autoAck, object : Consumer {
            override fun handleConsumeOk(consumerTag: String?) {
                consumerTag?.let {
                    println("$it has been registered as a callback")
                }
            }

            override fun handleCancelOk(consumerTag: String?) {
                //Perform cancellation tasks such as closing resources here
            }

            override fun handleCancel(consumerTag: String?) {
                //Perform cancellation tasks such as closing resources here
            }

            override fun handleShutdownSignal(consumerTag: String?, sig: ShutdownSignalException?) {
                sig?.let {
                    throw it
                }
            }

            override fun handleRecoverOk(consumerTag: String?) {
                // If connection issues, try to receive messages again
            }

            override fun handleDelivery(
                consumerTag: String?,
                envelope: Envelope?,
                properties: AMQP.BasicProperties?,
                body: ByteArray?
            ) {
                body?.let {
                    println((body.decodeToString()))
                }
            }

        })
    }
}