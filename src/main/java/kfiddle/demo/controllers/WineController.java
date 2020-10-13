package kfiddle.demo.controllers;

import kfiddle.demo.repositories.ReviewRepository;
import kfiddle.demo.repositories.WineRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class WineController {


    @Resource
    private WineRepository wineRepo;

    @RequestMapping("/wines")
    public String displayAllWinesInStore(Model model) {
        model.addAttribute("allWines", wineRepo.findAll());
        return "allWinesView";
    }

    @GetMapping("/wines/{wine}")
    public String displaySingleWineAndItsReviews(@PathVariable String wine, Model model) {
        model.addAttribute("singleWine", wineRepo.findWineByName(wine));
        return "singleWineView";
    }

    @GetMapping("{region}/wines")
    public String displayListOfWinesByRegion(@PathVariable String region, Model model) {
        model.addAttribute("winesOfRegion", wineRepo.findWinesByRegion(region));
        return "singleRegionView";
    }


}
