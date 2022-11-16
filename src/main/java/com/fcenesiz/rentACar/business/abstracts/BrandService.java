package com.fcenesiz.rentACar.business.abstracts;

import com.fcenesiz.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {// Business Rules
    List<Brand> getAll();
}
