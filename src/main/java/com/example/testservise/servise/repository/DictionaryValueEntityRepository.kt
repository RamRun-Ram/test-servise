package com.example.testservise.servise.repository

import com.example.testservise.domain.entity.DictionaryValueEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DictionaryValueEntityRepository : JpaRepository<DictionaryValueEntity?, Long?>