package com.eefenn.NationalIdentityServiceAPI.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.eefenn.NationalIdentityServiceAPI.repository.PersonRepository
import com.eefenn.NationalIdentityServiceAPI.model.Person

@Repository
interface PersonRepository : JpaRepository<Person, Long>