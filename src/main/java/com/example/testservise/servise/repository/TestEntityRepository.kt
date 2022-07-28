package com.example.testservise.servise.repository

import com.example.testservise.domain.entity.TestEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestEntityRepository : JpaRepository<TestEntity, Long?>