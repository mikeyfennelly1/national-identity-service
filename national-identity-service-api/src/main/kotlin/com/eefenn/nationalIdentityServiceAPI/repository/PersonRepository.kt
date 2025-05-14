package com.eefenn.nationalIdentityServiceAPI.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import com.eefenn.nationalIdentityServiceAPI.model.Person

@Repository
interface PersonRepository : JpaRepository<Person, Long>