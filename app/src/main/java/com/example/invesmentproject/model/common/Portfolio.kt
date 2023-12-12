package com.example.invesmentproject.model.common

import java.math.BigDecimal

data class Portfolio(val account: User, val positions: List<Position>)
data class Position(val figi: String, val quantity: Long, val currentPrice: BigDecimal)