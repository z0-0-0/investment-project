package com.example.invesmentproject.model.api.account

import com.example.invesmentproject.di.InvestApiClientModule.provideInvestApi
import com.example.invesmentproject.model.api.api_model.AccountId
import com.example.invesmentproject.model.api.api_model.Currency
import com.example.invesmentproject.model.api.api_model.Quotation
import com.example.invesmentproject.model.api.request_errors.wrapTinkoffRequest

class TinkoffSandboxService(token: String) {

    private val sandboxService = provideInvestApi(token).sandboxService

    fun createSandboxAccount(): Result<AccountId> =
        wrapTinkoffRequest {
            sandboxService.openAccount().get()
        }

    fun closeSandboxAccount(accountId: AccountId): Result<Unit> =
        wrapTinkoffRequest {
            sandboxService.closeAccount(accountId).get()
        }

    fun sandboxPayIn(accountId: AccountId, rubles: UInt): Result<Unit> =
        wrapTinkoffRequest {
            val moneyValue = Currency("RUB", Quotation(rubles, 0U)).toMoneyValue()
            sandboxService.payIn(accountId, moneyValue).get()
        }



}