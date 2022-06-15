package com.hiimakun.regionservice.services;

import com.hiimakun.regionservice.entities.Region;
import com.hiimakun.regionservice.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RegionIpmService implements RegionService {

    @Autowired
    private RegionRepository regionRepository;

    @Override
    public List<Region> listAllRegion() {
        return regionRepository.findAll();
    }

    @Override
    public Region findRegionById(Long regionId) {
        return regionRepository.findByRegionId(regionId);
    }

    @Override
    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public String deleteRegionById(Long regionId) {
        boolean exists = regionRepository.existsById(regionId);
        if (exists) {
            regionRepository.deleteById(regionId);
            return "Delete region successfully";
        } else {
            return "Delete region failed";
        }
    }


}
