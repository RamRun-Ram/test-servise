package com.example.testservise.servise;

import com.example.testservise.domain.dto.TestDto;

import java.util.List;

public interface TestService {
    TestDto findByIdTest(Long id);
    List<TestDto> findAllTest();
    TestDto createTest(TestDto testDto);
    TestDto updateTest(TestDto testDto);
    boolean deleteTest(Long id);
}
