package com.codelab.bank.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "accounts")
data class Account (
    @Id @GeneratedValue
    val id: Long? = null,
    val name: String,
    val document: String,
    val phone: String)
