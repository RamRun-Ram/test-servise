package com.example.testservise.controller

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.RequestMapping
import com.example.testservise.servise.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.http.ResponseEntity
import com.example.testservise.domain.entity.TestEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping

@Controller
@RequiredArgsConstructor
@RequestMapping("/test")
class TestController(private var testService: TestService) {

    @GetMapping("/get/{id}")
    fun findByIdTest(@PathVariable id: Long?): ResponseEntity<TestEntity> {
        return ResponseEntity.ok(testService.findByIdTest(id!!))
    }

    @PostMapping("/create")
    fun createTestDto(@RequestBody testEntity: TestEntity): ResponseEntity<TestEntity> {
        return ResponseEntity.ok(testService.createTest(testEntity))
    }

    @PutMapping
    fun updateTest(@RequestBody testEntity: TestEntity?): ResponseEntity<TestEntity> {
        return ResponseEntity.ok(testService.updateTest(testEntity!!))
    }

    @DeleteMapping("/{id}")
    fun deleteTest(@PathVariable id: Long?): ResponseEntity<Boolean> {
        return ResponseEntity.ok(testService.deleteTest(id!!))
    }
}