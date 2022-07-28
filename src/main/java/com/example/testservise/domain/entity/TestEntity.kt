package com.example.testservise.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameTest;

    @ManyToOne(cascade = CascadeType.ALL)
    private DocumentEntity documentEntity;
    @ManyToOne(cascade = CascadeType.ALL)
    private DictionaryValueEntity dictionaryValueEntity;



}
