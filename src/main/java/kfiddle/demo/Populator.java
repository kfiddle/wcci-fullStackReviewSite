package kfiddle.demo;

import kfiddle.demo.models.Region;
import kfiddle.demo.models.Review;
import kfiddle.demo.models.Wine;
import kfiddle.demo.repositories.RegionRepository;
import kfiddle.demo.repositories.ReviewRepository;
import kfiddle.demo.repositories.WineRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class Populator implements CommandLineRunner {

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private WineRepository wineRepo;

    @Resource
    private ReviewRepository reviewRepo;


    @Override
    public void run(String... args) throws Exception {


        Region fingerLakes = new Region("Finger-Lakes");
        Region chile = new Region("Chile");
        Region bordeaux = new Region("Bordeaux");
        Region napa = new Region("Napa");
        Region alsace = new Region("Alsace");
        Region tuscany = new Region("Tuscany");
        Region champagne = new Region("Champagne");
        Region oregon = new Region("Oregon");
        Region veneto = new Region("Veneto");
        Region provence = new Region("Provence");

        regionRepo.save(fingerLakes);
        regionRepo.save(chile);
        regionRepo.save(bordeaux);
        regionRepo.save(napa);
        regionRepo.save(alsace);
        regionRepo.save(tuscany);
        regionRepo.save(champagne);
        regionRepo.save(oregon);
        regionRepo.save(veneto);
        regionRepo.save(provence);

        Wine wine1 = new Wine("CVS Chardonnay", fingerLakes);
        Wine wine2 = new Wine("Chateauneuf du-Pape", provence);
        Wine wine3 = new Wine("Bread and Butter", napa);
        Wine wine4 = new Wine("Chateaux Lafite Rothschild", bordeaux);
        Wine wine5 = new Wine("Chateaux Mot du Jour", bordeaux);
        Wine wine6 = new Wine("Screaming Hawk", fingerLakes);
        Wine wine7 = new Wine("Couronne", provence);
        Wine wine8 = new Wine("Chateaux Garonne", bordeaux);
        Wine wine9 = new Wine("Gironde", bordeaux);
        Wine wine10 = new Wine("Doubting Bird", napa);
        Wine wine11 = new Wine("Vina Vik", chile);
        Wine wine12 = new Wine("Loma Larga", chile);
        Wine wine13 = new Wine("Alsace Vin", alsace);
        Wine wine14 = new Wine("Alsace rouge", alsace);
        Wine wine15 = new Wine("Il Borro Super", tuscany);
        Wine wine16 = new Wine("Mante Antico", tuscany);
        Wine wine17 = new Wine("Bertrand Senecourt", champagne);
        Wine wine18 = new Wine("Wycliff Brut", champagne);
        Wine wine19 = new Wine("Antiquum", oregon);
        Wine wine20 = new Wine("Hyland", oregon);
        Wine wine21 = new Wine("Grand Passione", veneto);
        Wine wine22 = new Wine("Giuseppe Quintarelli", veneto);

        wineRepo.save(wine1);
        wineRepo.save(wine2);
        wineRepo.save(wine3);
        wineRepo.save(wine4);
        wineRepo.save(wine5);
        wineRepo.save(wine6);
        wineRepo.save(wine7);
        wineRepo.save(wine8);
        wineRepo.save(wine9);
        wineRepo.save(wine10);
        wineRepo.save(wine11);
        wineRepo.save(wine12);
        wineRepo.save(wine13);
        wineRepo.save(wine14);
        wineRepo.save(wine15);
        wineRepo.save(wine16);
        wineRepo.save(wine17);
        wineRepo.save(wine18);
        wineRepo.save(wine19);
        wineRepo.save(wine20);
        wineRepo.save(wine21);
        wineRepo.save(wine22);

        Review review = new Review("Let's try this out", wine1);
        Review review1 = new Review("content1", wine1);
        Review review2 = new Review("content2", wine2);
        Review review3 = new Review("content3", wine3);
        Review review4 = new Review("content4", wine4);
        Review review5 = new Review("content5", wine5);
        Review review6 = new Review("content6", wine6);
        Review review7 = new Review("content7", wine7);
        Review review8 = new Review("content8", wine8);
        Review review9 = new Review("content9", wine9);
        Review review10 = new Review("content10", wine10);
        Review review11 = new Review("content11", wine11);
        Review review12 = new Review("content12", wine12);
        Review review13 = new Review("content13", wine13);
        Review review14 = new Review("content14", wine14);
        Review review15 = new Review("content15", wine15);
        Review review16 = new Review("content16", wine16);
        Review review17 = new Review("content17", wine17);
        Review review18 = new Review("content18", wine18);
        Review review19 = new Review("content19", wine19);
        Review review20 = new Review("content20", wine20);
        Review review21 = new Review("content21", wine21);
        Review review22 = new Review("content22", wine22);


        reviewRepo.save(review);
        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);
        reviewRepo.save(review4);
        reviewRepo.save(review5);
        reviewRepo.save(review6);
        reviewRepo.save(review7);
        reviewRepo.save(review8);
        reviewRepo.save(review9);
        reviewRepo.save(review10);
        reviewRepo.save(review11);
        reviewRepo.save(review12);
        reviewRepo.save(review13);
        reviewRepo.save(review14);
        reviewRepo.save(review15);
        reviewRepo.save(review16);
        reviewRepo.save(review17);
        reviewRepo.save(review18);
        reviewRepo.save(review19);
        reviewRepo.save(review20);
        reviewRepo.save(review21);
        reviewRepo.save(review22);

    }
}
