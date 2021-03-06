package com.example.querydsl_setting.domain.bar

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Bar(
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long?,

    val no: Long,

    val lyrics: String,

    val fingeringId: Long,

    val sheetId: Long
)