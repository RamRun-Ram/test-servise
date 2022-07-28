package com.example.testservise.servise.impl

import com.example.testservise.domain.entity.TestEntity
import com.example.testservise.servise.TestService
import com.example.testservise.servise.repository.TestEntityRepository
import java.lang.RuntimeException
import org.springframework.stereotype.Service

@Service
class TestServiceImpl(private var testRepository: TestEntityRepository) : TestService {


    override fun findByIdTest(id: Long): TestEntity? {
        return testRepository.findById(id).orElseThrow { RuntimeException() }!!
    }

    override fun createTest(testEntity: TestEntity): TestEntity {
        return testRepository.save(testEntity)
    }

    override fun updateTest(testEntity: TestEntity): TestEntity? {
        if (testEntity.id != null && testRepository!!.existsById(testEntity.id)) {
            return testRepository.save(testEntity)
        }
        throw RuntimeException()
    }

    override fun deleteTest(id: Long): Boolean {
        if (testRepository.existsById(id)) {
            testRepository.deleteById(id)
            return true
        }
        throw RuntimeException()
    }
}