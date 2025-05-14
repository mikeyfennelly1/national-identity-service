package com.eefenn.nationalIdentityServiceAPI.controller

import org.springframework.web.bind.annotation.*

import com.eefenn.nationalIdentityServiceAPI.repository.PersonRepository
import com.eefenn.nationalIdentityServiceAPI.model.Person
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/api/persons")
class PersonController(
    private val personRepository: PersonRepository
) {
    @GetMapping
    fun getAllPersons(): List<Person> = personRepository.findAll()

    @GetMapping("/{id}")
    fun getPersonById(@PathVariable id: Long): Person? = personRepository.findById(id).orElse(null)

    @PostMapping
    fun addPerson(@RequestBody person: Person): ResponseEntity<Any> {
        try {
            val savedUser = personRepository.save(person)
            return ResponseEntity(savedUser, HttpStatus.OK)
        } catch (e: DataIntegrityViolationException) {
            return ResponseEntity("Data integrity violation: ${e.message}", HttpStatus.BAD_REQUEST)
        } catch (e: Exception) {
            return ResponseEntity(e.message, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}
