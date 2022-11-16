package com.fcenesiz.rentACar.business.abstracts;

import com.fcenesiz.rentACar.business.requests.CreateBrandRequest;
import com.fcenesiz.rentACar.business.responses.GetAllBrandsResponse;
import java.util.List;

public interface BrandService {// Business Rules
    void add(CreateBrandRequest createBrandRequest);
    List<GetAllBrandsResponse> getAll();
}
