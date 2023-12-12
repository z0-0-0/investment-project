package com.example.invesmentproject.model.dbwrapper.dao

import com.example.invesmentproject.model.common.User
import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insertAndGetId
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

internal object UserAccounts : LongIdTable("user_accounts") {
    val username = varchar("urername", 100)
    val password = varchar("password", 10)
    val token = varchar("token", 100)

    fun toDomain(row: ResultRow): User {
        return User(
            id = row[id].value,
            username = row[username],
            password = row[password],
            token = row[token]
        )
    }
}

class AccountDAO {
    fun insertAndGetId(username: String, password: String, token: String): Long = transaction {
        UserAccounts.insertAndGetId {
            it[UserAccounts.username] = username
            it[UserAccounts.password] = password
            it[UserAccounts.token] = token
        }.value
    }

    fun find(accountId: Long): User? = transaction {
        UserAccounts
            .select { UserAccounts.id eq accountId }
            .map { UserAccounts.toDomain(it) }
            .singleOrNull()
    }

}