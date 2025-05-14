package com.eefenn.NationalIdentityServiceAPI.model

import jakarta.persistence.*

@Entity
@Table(name = "person")
data class Person (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    val age: Int
)