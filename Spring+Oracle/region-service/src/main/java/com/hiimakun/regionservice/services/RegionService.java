package com.hiimakun.regionservice.services;

import com.hiimakun.regionservice.entities.Region;

import java.util.List;


public interface RegionService {
    public abstract List<Region> listAllRegion();

    Region findRegionById(Long regionId);

    Region saveRegion(Region region);

    String deleteRegionById(Long regionId);
}
