package com.example.testservise.mapper;

import com.example.testservise.domain.dto.TestDto;
import com.example.testservise.domain.entity.TestEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    TestDto testToDto(TestEntity testEntity);
    TestEntity testToEntity(TestDto testDto);
    List<TestDto> testEntityListToDtoList(List<TestEntity> testEntityList);
}
