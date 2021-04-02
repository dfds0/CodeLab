package com.codelab.bank

import com.codelab.bank.model.Account
import com.codelab.bank.repository.AccountRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
class AccountControllerTests {

    @Autowired
    lateinit var mock: MockMvc

    @Autowired
    lateinit var repository: AccountRepository

    @Test
    fun test_list() {
        val accountDraft = Account(name = "test_list", document = "01234", phone = "98765")
        repository.save(accountDraft)

        mock.perform(MockMvcRequestBuilders.get("/account"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.jsonPath("\$[0].name").isString)
            .andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun test_get() {
        val accountDraft = Account(name = "test_get", document = "01234", phone = "98765")
        val account = repository.save(accountDraft)

        mock.perform(MockMvcRequestBuilders.get("/account/${account.id}"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.jsonPath("\$.name").isString)
            .andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun test_post() {
        val accountDraft = Account(name = "test_post", document = "01234", phone = "98765")
        val json = ObjectMapper().writeValueAsString(accountDraft)

        mock.perform(MockMvcRequestBuilders.post("/account")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(json))
            .andExpect(MockMvcResultMatchers.status().isCreated)
            .andDo(MockMvcResultHandlers.print())
    }

    @Test
    fun test_update() {
        val accountDraft = Account(name = "test_update", document = "01234", phone = "98765")
        repository.save(accountDraft)

        val accountCopy = accountDraft.copy(name = "new", document = "new", phone = "new")

        val json = ObjectMapper().writeValueAsString(accountCopy)

        mock.perform(MockMvcRequestBuilders.put("/account/${accountDraft.id}")
            .accept(MediaType.APPLICATION_JSON)
            .contentType(MediaType.APPLICATION_JSON)
            .content(json))
            .andExpect(MockMvcResultMatchers.jsonPath("\$.name").isString)
            .andDo(MockMvcResultHandlers.print())

        val account = accountDraft.id?.let { repository.findById(it) }
        Assertions.assertNotNull(account)
        Assertions.assertEquals(accountCopy.name, account?.get()?.name)
    }

    @Test
    fun test_delete() {
        val accountDraft = Account(name = "test_delete", document = "01234", phone = "98765")
        repository.save(accountDraft)

        mock.perform(MockMvcRequestBuilders.delete("/account/${accountDraft.id}"))
            .andExpect(MockMvcResultMatchers.status().isCreated)
            .andDo(MockMvcResultHandlers.print())

        val account = accountDraft.id?.let { repository.findById(it) }
        Assertions.assertNull(account)
    }
}