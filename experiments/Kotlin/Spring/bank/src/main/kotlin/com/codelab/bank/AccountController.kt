package com.codelab.bank

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/accounts")
class AccountController (private val repository: AccountRepository) {

    @GetMapping
    fun list(): List<Account> {
        return repository.findAll()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody account: Account): Account {
        return repository.save(account)
    }

    @GetMapping("/{id}")
    fun find(@PathVariable id: Long): ResponseEntity<Account> {
        return repository.findById(id).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody account: Account): ResponseEntity<Account> {
        return repository.findById(id).map {
            val draft = it.copy(name = it.name, document = it.document, phone = it.phone)
            val instance = repository.save(draft)
            ResponseEntity.ok(instance)
        }.orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        return repository.findById(id).map {
            repository.delete(it)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())
    }

}