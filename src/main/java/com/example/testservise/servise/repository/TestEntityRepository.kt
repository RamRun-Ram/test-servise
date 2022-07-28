package com.example.testservise.servise.repository;

import com.example.testservise.domain.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity,Long> {
}
