package com.example.invesmentproject.model.api.account

import com.example.invesmentproject.model.api.response.PositionsResponse
interface TAccount {
    fun getPositions(): Result<PositionsResponse>
}