package com.example.testservise.domain.dto;

import com.example.testservise.domain.entity.DictionaryValueEntity;
import com.example.testservise.domain.entity.DocumentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDto {
    private Long id;

    private String nameTest;
    private DocumentEntity documentEntity;
    private DictionaryValueEntity dictionaryValueEntity;


}
