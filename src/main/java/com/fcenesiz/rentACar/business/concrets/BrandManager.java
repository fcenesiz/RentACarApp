package com.fcenesiz.rentACar.business.concrets;

import com.fcenesiz.rentACar.business.abstracts.BrandService;
import com.fcenesiz.rentACar.data_access.abstracts.BrandRepository;
import com.fcenesiz.rentACar.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

}