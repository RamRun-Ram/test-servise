package com.example.testservise.servise

import com.example.testservise.domain.entity.TestEntity

interface TestService {
    fun findByIdTest(id: Long): TestEntity?
    fun createTest(testEntity: TestEntity): TestEntity
    fun updateTest(testEntity: TestEntity): TestEntity?
    fun deleteTest(id: Long): Boolean
}