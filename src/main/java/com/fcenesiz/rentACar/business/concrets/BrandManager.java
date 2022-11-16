package com.fcenesiz.rentACar.business.concrets;

import com.fcenesiz.rentACar.business.abstracts.BrandService;
import com.fcenesiz.rentACar.business.requests.CreateBrandRequest;
import com.fcenesiz.rentACar.business.responses.GetAllBrandsResponse;
import com.fcenesiz.rentACar.data_access.abstracts.BrandRepository;
import com.fcenesiz.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<>();
        brands.forEach(item ->{
            GetAllBrandsResponse response = new GetAllBrandsResponse(
                    item.getId(),
                    item.getName()
            );
            brandsResponse.add(response);
        });
        return brandsResponse;
    }

}
