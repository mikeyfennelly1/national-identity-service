package com.eefenn.NationalIdentityServiceAPI.controller

import org.springframework.web.bind.annotation.*

import com.eefenn.NationalIdentityServiceAPI.repository.PersonRepository
import com.eefenn.NationalIdentityServiceAPI.model.Person

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
