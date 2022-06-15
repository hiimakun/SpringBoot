package com.hiimakun.regionservice.repositories;

import com.hiimakun.regionservice.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
    Region findByRegionId(Long regionId);
}
