package com.example.testservise.servise.impl;

import com.example.testservise.domain.dto.TestDto;
import com.example.testservise.domain.entity.TestEntity;
import com.example.testservise.mapper.TestMapper;
import com.example.testservise.servise.TestService;
import com.example.testservise.servise.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestRepository testRepository;
    private final TestMapper testMapper;

    @Override
    public TestDto findByIdTest(Long id) {
        TestEntity testEntity = testRepository.findById(id).orElseThrow(RuntimeException::new);
        return testMapper.testToDto(testEntity);
    }

    @Override
    public List<TestDto> findAllTest() {
        List<TestEntity> testDtoList = testRepository.findAll();
        return testMapper.testEntityListToDtoList(testDtoList);
    }

    @Override
    public TestDto createTest(TestDto testDto) {
        TestEntity testEntity = testRepository.save(testMapper.testToEntity(testDto));
        return testMapper.testToDto(testEntity);
    }

    @Override
    public TestDto updateTest(TestDto testDto) {
        if (testDto.getId() != null && testRepository.existsById(testDto.getId())) {
            TestEntity testEntity = testRepository.save(testMapper.testToEntity(testDto));
            return testMapper.testToDto(testEntity);
        }
        throw new RuntimeException();
    }

    @Override
    public boolean deleteTest(Long id) {
        if (testRepository.existsById(id)) {
            testRepository.deleteById(id);
            return true;
        }
        throw new RuntimeException();
    }
}
