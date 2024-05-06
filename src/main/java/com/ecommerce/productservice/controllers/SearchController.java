package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.service.GenericProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
    private final GenericProductService genericProductService;

    public SearchController(GenericProductService genericProductService) {
        this.genericProductService = genericProductService;
    }

    @GetMapping("/generate")
    public ResponseEntity generateData() {
        return ResponseEntity.ok(genericProductService.generateProductData());
    }
}
