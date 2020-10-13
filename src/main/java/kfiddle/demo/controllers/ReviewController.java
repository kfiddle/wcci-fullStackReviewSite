package kfiddle.demo.controllers;

import kfiddle.demo.repositories.ReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

@Controller
public class ReviewController {

@Resource
    private ReviewRepository reviewRepo;

    @GetMapping("/wines/{wine}")
    public String displaySingleWineAndItsReviews(@PathVariable String wine, Model model) {
        model.addAttribute("singleWineReviewsList", reviewRepo.findByWineName(wine));
        model.addAttribute("nameOfWine", wine);
        return "singleWineReviewsView";

    }
}
