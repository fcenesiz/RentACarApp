package com.fcenesiz.rentACar.api.controllers;

import com.fcenesiz.rentACar.business.abstracts.BrandService;
import com.fcenesiz.rentACar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    public List<Brand> getAll(){
        return brandService.getAll();
    }

}