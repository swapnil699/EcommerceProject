package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.models.GenericProduct;
import com.ecommerce.productservice.service.GenericProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping("/all")
    public ResponseEntity<List<GenericProduct>> searchProducts(
            @RequestParam(value = "q", required = false) String query) {
        return ResponseEntity.ok(genericProductService.searchProducts(query));
    }
}
