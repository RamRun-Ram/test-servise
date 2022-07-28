package com.example.testservise.domain.entity

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class DocumentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    val documentDate: LocalDate
)