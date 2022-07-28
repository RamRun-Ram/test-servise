package com.example.testservise.servise.repository

import com.example.testservise.domain.entity.DocumentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DocumentEntityRepository : JpaRepository<DocumentEntity?, Long?>