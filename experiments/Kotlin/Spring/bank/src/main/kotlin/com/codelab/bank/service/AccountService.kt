package com.codelab.bank.service

import com.codelab.bank.model.Account
import java.util.*

interface AccountService {

    fun list(): List<Account>
    fun create(account: Account): Account
    fun findById(id: Long): Optional<Account>
    fun update(id: Long, account: Account): Optional<Account>
    fun delete(id: Long)
}