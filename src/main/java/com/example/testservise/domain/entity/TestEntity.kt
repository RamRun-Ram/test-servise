package com.example.testservise.domain.entity

import javax.persistence.*

@Entity
class TestEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var nameTest: String,
    @ManyToOne(cascade = [CascadeType.ALL])
    var documentEntity: DocumentEntity,
    @ManyToOne(cascade = [CascadeType.ALL])
    var dictionaryValueEntity: DictionaryValueEntity
)
