package com.example.testservise.servise.repository;

import com.example.testservise.domain.entity.DictionaryValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictionaryValueRepository extends JpaRepository<DictionaryValueEntity,Long> {
}
