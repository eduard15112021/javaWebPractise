package com.web.maven.example.demo.controller;

import com.web.maven.example.demo.dto.PersonDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Validated
@RestController
@RequestMapping("/api/person")
public class MyController {

    @GetMapping("{id}")
    public  ResponseEntity<String> getById(
            @PathVariable("id") @Min(1) int personId
            ){
        return ResponseEntity.ok("valid"+personId);
    }

    @PostMapping("")
    public ResponseEntity<String> valid(@Valid  @RequestBody PersonDto personDto){
        return ResponseEntity.ok("valid");
    }
}
