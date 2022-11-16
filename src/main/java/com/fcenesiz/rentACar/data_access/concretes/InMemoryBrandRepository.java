package com.fcenesiz.rentACar.data_access.concretes;

import com.fcenesiz.rentACar.data_access.abstracts.BrandRepository;
import com.fcenesiz.rentACar.entity.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository(){
        brands = new ArrayList<>();
        brands.add(new Brand(0, "BMW"));
        brands.add(new Brand(1, "Audi"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Fiat"));
        brands.add(new Brand(4, "Renault"));
        brands.add(new Brand(5, "Jeep"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
