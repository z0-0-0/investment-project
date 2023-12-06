package com.example.invesmentproject.model.api.response

import kotlinx.serialization.Serializable

@Serializable
data class PortfolioResponse(
    val positions: List<PositionItem>
) {
    @Serializable
    data class PositionItem(
        val figi: String,
        val instrumentType: String,
        val lots: String,
        val name: String,
        val balance: String,
        var ticker: String,
        var blocked: String = "",
    )
}