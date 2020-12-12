package kfiddle.demo.controllers;

import kfiddle.demo.models.Region;
import kfiddle.demo.repositories.RegionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayAllRegions(Model model) {
        model.addAttribute("regions", regionRepo.findAll());
        return "regionsView";
    }

    @GetMapping("/regions/{region}")
    public String displayWinesByRegion(@PathVariable String region, Model model) {
        model.addAttribute("singleRegion", regionRepo.findByRegion(region));
        return "singleRegionView";
    }


}











