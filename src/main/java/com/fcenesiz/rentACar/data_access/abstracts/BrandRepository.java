package com.fcenesiz.rentACar.data_access.abstracts;

import com.fcenesiz.rentACar.entity.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {// or BrandDao for naming
    List<Brand> getAll();
}
