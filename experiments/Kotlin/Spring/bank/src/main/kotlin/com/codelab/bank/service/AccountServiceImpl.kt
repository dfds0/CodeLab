package com.codelab.bank.service

import com.codelab.bank.model.Account
import com.codelab.bank.repository.AccountRepository
import org.springframework.stereotype.Service
import org.springframework.util.Assert
import org.springframework.web.bind.annotation.*
import java.util.*

@Service
class AccountServiceImpl(private val repository: AccountRepository) : AccountService {

    override fun list(): List<Account> {
        return repository.findAll()
    }

    override fun create(account: Account): Account {
        Assert.isTrue(account.name.length > 5,"[name] need contains at less 5 characters")
        Assert.isTrue(account.document.length == 11, "[document] is out of pattern")

        return repository.save(account)
    }

    override fun findById(id: Long): Optional<Account> {
        return repository.findById(id)
    }

    override fun update(id: Long, account: Account): Optional<Account> {
        Assert.isTrue(account.name.length > 5,"[name] need contains at less 5 characters")
        Assert.isTrue(account.document.length == 11, "[document] is out of pattern")

        val optional = findById(id)
        if (optional.isPresent)
            optional.map {
                val draft = it.copy(name = account.name, document = account.document, phone = account.phone)
                repository.save(draft)
            }

        return optional
    }

    override fun delete(@PathVariable id: Long) {
        repository.findById(id).map {
            repository.delete(it)
        }.orElse(throw RuntimeException("Not found"))
    }
}