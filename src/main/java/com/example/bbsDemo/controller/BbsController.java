package com.example.bbsDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/demo")
public class BbsController {

    @GetMapping
    public ResponseEntity<String> list() {
        return ResponseEntity.ok("Hello, BBS Demo!");
    }
}
