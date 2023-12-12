package com.example.invesmentproject.model.api.request_errors

internal fun <String> wrapTinkoffRequest(requestToTinkoffApi: () -> String): Result<String> =
    try {
        Result.success(requestToTinkoffApi())
    } catch (e: Throwable) {
        Result.failure(e)
    }

internal fun <T> waitForSuccess(block: () -> Result<T>): T {
    while (true) {
        val result = block()
        if (result.isSuccess) {
            return result.getOrThrow()
        }
    }
}