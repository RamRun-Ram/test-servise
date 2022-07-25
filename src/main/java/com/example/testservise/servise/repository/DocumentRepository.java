package com.example.testservise.servise.repository;

import com.example.testservise.domain.entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<DocumentEntity,Long> {
}
