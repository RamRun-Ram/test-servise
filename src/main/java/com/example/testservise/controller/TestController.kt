package com.example.testservise.controller;

import com.example.testservise.domain.dto.TestDto;
import com.example.testservise.servise.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    @GetMapping("/get/{id}")
    public ResponseEntity<TestDto>  findByIdTest(@PathVariable Long id) {
        return ResponseEntity.ok(testService.findByIdTest(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<TestDto>>  findAllTest(){
        return ResponseEntity.ok(testService.findAllTest()) ;
    }

    @PostMapping("/create")
    public ResponseEntity<TestDto> createTestDto(@RequestBody TestDto testDto){
        return ResponseEntity.ok(testService.createTest(testDto));
    }

    @PutMapping
    public ResponseEntity<TestDto> updateTest(@RequestBody TestDto testDto){
        return ResponseEntity.ok(testService.updateTest(testDto)) ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteTest(@PathVariable Long id){
        return ResponseEntity.ok(testService.deleteTest(id));
    }




}
