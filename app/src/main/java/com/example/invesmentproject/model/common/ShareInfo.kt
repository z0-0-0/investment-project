package com.example.invesmentproject.model.common

import java.math.BigDecimal

data class ShareInfo(
    val figi: String,
    val name: String,
    val price: BigDecimal,
    val available: Long,
)
data class ShareQuantity(
    val figi: String,
    val quantity: Long
)