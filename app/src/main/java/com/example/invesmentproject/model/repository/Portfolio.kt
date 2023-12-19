package com.example.invesmentproject.model.repository

data class Portfolio(
    val totalAmountShares: MoneyValue,
    val expectedYield: Quotation,
    val positions: List<PortfolioPosition>,
    val accountId: String,
    val totalAmountPortfolio: MoneyValue
)

data class PortfolioPosition(
    val figi: String,
    val quantity: Quotation,
    val averagePositionPrice: MoneyValue,
    val expectedYield: Quotation,
    val currentPrice: MoneyValue,
)

data class Quotation(
    val units: Int,
    val nano: Int
)

data class MoneyValue(
    val currency: String,
    val units: Int,
    val nano: Int
)