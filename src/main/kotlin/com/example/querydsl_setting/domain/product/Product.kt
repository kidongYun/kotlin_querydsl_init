package com.example.querydsl_setting.domain.product

import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "products")
data class Product(
    @Column(name = "name")
    val name: String,

    @Column(name = "quantity")
    var quantity: Long,

    @Column(name = "registeredAt")
    val registeredAt: LocalDateTime,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
)