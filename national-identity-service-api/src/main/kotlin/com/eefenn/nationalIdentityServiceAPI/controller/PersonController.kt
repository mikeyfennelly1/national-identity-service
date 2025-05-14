package com.eefenn.nationalIdentityServiceAPI.controller

import org.springframework.web.bind.annotation.*

import com.eefenn.nationalIdentityServiceAPI.repository.PersonRepository
import com.eefenn.nationalIdentityServiceAPI.model.Person

@RestController
@RequestMapping("/api/persons")
class PersonController(
    private val personRepository: PersonRepository
) {
    @GetMapping
    fun getAllPersons(): List<Person> = personRepository.findAll()

    @GetMapping("/{id}")
    fun getPersonById(@PathVariable id: Long): Person? = personRepository.findById(id).orElse(null)
}
