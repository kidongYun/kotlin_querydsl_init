package com.example.querydsl_setting.domain.bar

import com.querydsl.jpa.impl.JPAQueryFactory

class BarRepositoryCustomImpl(
    private val queryFactory: JPAQueryFactory
) : BarRepositoryCustom {
}