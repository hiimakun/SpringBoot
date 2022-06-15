package com.hiimakun.regionservice.controllers;

import com.hiimakun.regionservice.entities.Region;
import com.hiimakun.regionservice.services.RegionIpmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionController {
    @Autowired
    private RegionIpmService regionIpmService;

    @GetMapping("/")
    public List<Region> regionList(){
        return regionIpmService.listAllRegion();
    }
    @GetMapping("/{id}")
    public Region findRegionById(@PathVariable("id") Long regionId){
        return regionIpmService.findRegionById(regionId);
    }

    @PostMapping("/insert")
    public Region saveRegion(@RequestBody Region region){
        return regionIpmService.saveRegion(region);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRegionById(@PathVariable("id") Long regionId){
        return regionIpmService.deleteRegionById(regionId);
    }
}
