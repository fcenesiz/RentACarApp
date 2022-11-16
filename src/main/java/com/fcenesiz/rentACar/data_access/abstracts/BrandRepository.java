package com.fcenesiz.rentACar.data_access.abstracts;

import com.fcenesiz.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {// or BrandDao for naming
    List<Brand> getAll();
}
