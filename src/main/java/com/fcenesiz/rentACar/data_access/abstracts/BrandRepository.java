package com.fcenesiz.rentACar.data_access.abstracts;

import com.fcenesiz.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand, Integer> {// or BrandDao for naming

}
