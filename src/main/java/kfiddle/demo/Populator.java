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

        Review review = new Review("This is pretty awful. Do stay away.", wine1);
        Review review1 = new Review("I gave some to my cat the other day, and he loved it", wine1);
        Review review2 = new Review("I love it!", wine1);
        Review review3 = new Review("I don't often drink, but when I do, it's this for sure.", wine1);
        Review review4 = new Review("I like this, but I don't recommend mixing it with your coffee", wine1);
        Review review5 = new Review("It's ok- maybe a bit pricey", wine1);

        Review review6 = new Review("I'm not a fan, but then I like cheap beer", wine2);
        Review review7 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine2);
        Review review8 = new Review("Save your money!", wine2);
        Review review9 = new Review("I was surpised. This works just fine.", wine2);
        Review review10 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine2);

        Review review11 = new Review("The second bottle was better than the first", wine3);
        Review review12 = new Review("I just wanted to write a review...I don't know who good this is", wine3);
        Review review13 = new Review("Is this french?", wine3);
        Review review14 = new Review("I had enough of this- you'd think I'd remember how good it was", wine3);
        Review review15 = new Review("My dog prefers the beer I give him.", wine3);

        Review review16 = new Review("I'm not a fan, but then I like cheap beer", wine4);
        Review review17 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine4);
        Review review18 = new Review("Save your money!", wine4);
        Review review19 = new Review("I was surpised. This works just fine.", wine4);
        Review review20 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine4);

        Review review21 = new Review("This is pretty awful. Do stay away.", wine5);
        Review review22 = new Review("I gave some to my cat the other day, and he loved it", wine5);
        Review review23 = new Review("I love it!", wine5);
        Review review24 = new Review("I don't often drink, but when I do, it's this for sure.", wine5);
        Review review25 = new Review("I like this, but I don't recommend mixing it with your coffee", wine5);
        Review review26 = new Review("It's ok- maybe a bit pricey", wine5);

        Review review27 = new Review("I'm not a fan, but then I like cheap beer", wine6);
        Review review28 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine6);
        Review review29 = new Review("Save your money!", wine6);
        Review review30 = new Review("I was surpised. This works just fine.", wine6);
        Review review31 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine6);

        Review review32 = new Review("The second bottle was better than the first", wine7);
        Review review33 = new Review("I just wanted to write a review...I don't know who good this is", wine7);
        Review review34 = new Review("Is this french?", wine7);
        Review review35 = new Review("I had enough of this- you'd think I'd remember how good it was", wine7);
        Review review36 = new Review("My dog prefers the beer I give him.", wine7);

        Review review37 = new Review("I'm not a fan, but then I like cheap beer", wine8);
        Review review38 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine8);
        Review review39 = new Review("Save your money!", wine8);
        Review review40 = new Review("I was surpised. This works just fine.", wine8);
        Review review41 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine8);

        Review review42 = new Review("The second bottle was better than the first", wine9);
        Review review43 = new Review("I just wanted to write a review...I don't know who good this is", wine9);
        Review review44 = new Review("Is this french?", wine9);
        Review review45 = new Review("I had enough of this- you'd think I'd remember how good it was", wine9);
        Review review46 = new Review("My dog prefers the beer I give him.", wine9);

        Review review47 = new Review("I'm not a fan, but then I like cheap beer", wine10);
        Review review48 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine10);
        Review review49 = new Review("Save your money!", wine10);
        Review review50 = new Review("I was surpised. This works just fine.", wine10);
        Review review51 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine10);

        Review review52 = new Review("The second bottle was better than the first", wine11);
        Review review53 = new Review("I just wanted to write a review...I don't know who good this is", wine11);
        Review review54 = new Review("Is this french?", wine11);
        Review review55 = new Review("I had enough of this- you'd think I'd remember how good it was", wine11);
        Review review56 = new Review("My dog prefers the beer I give him.", wine11);

        Review review57 = new Review("I'm not a fan, but then I like cheap beer", wine12);
        Review review58 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine12);
        Review review59 = new Review("Save your money!", wine12);
        Review review60 = new Review("I was surpised. This works just fine.", wine12);
        Review review61 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine12);

        Review review62 = new Review("The second bottle was better than the first", wine13);
        Review review63 = new Review("I just wanted to write a review...I don't know who good this is", wine13);
        Review review64 = new Review("Is this french?", wine13);
        Review review65 = new Review("I had enough of this- you'd think I'd remember how good it was", wine13);
        Review review66 = new Review("My dog prefers the beer I give him.", wine13);

        Review review67 = new Review("I'm not a fan, but then I like cheap beer", wine14);
        Review review68 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine14);
        Review review69 = new Review("Save your money!", wine14);
        Review review70 = new Review("I was surpised. This works just fine.", wine14);
        Review review71 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine14);

        Review review72 = new Review("The second bottle was better than the first", wine15);
        Review review73 = new Review("I just wanted to write a review...I don't know who good this is", wine15);
        Review review74 = new Review("Is this french?", wine15);
        Review review75 = new Review("I had enough of this- you'd think I'd remember how good it was", wine15);
        Review review76 = new Review("My dog prefers the beer I give him.", wine15);

        Review review77 = new Review("I'm not a fan, but then I like cheap beer", wine16);
        Review review78 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine16);
        Review review79 = new Review("Save your money!", wine16);
        Review review80 = new Review("I was surpised. This works just fine.", wine16);
        Review review81 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine16);

        Review review82 = new Review("The second bottle was better than the first", wine17);
        Review review83 = new Review("I just wanted to write a review...I don't know who good this is", wine17);
        Review review84 = new Review("Is this french?", wine17);
        Review review85 = new Review("I had enough of this- you'd think I'd remember how good it was", wine17);
        Review review86 = new Review("My dog prefers the beer I give him.", wine17);

        Review review87 = new Review("I'm not a fan, but then I like cheap beer", wine18);
        Review review88 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine18);
        Review review89 = new Review("Save your money!", wine18);
        Review review90 = new Review("I was surpised. This works just fine.", wine18);
        Review review91 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine18);

        Review review92 = new Review("The second bottle was better than the first", wine19);
        Review review93 = new Review("I just wanted to write a review...I don't know who good this is", wine19);
        Review review94 = new Review("Is this french?", wine19);
        Review review95 = new Review("I had enough of this- you'd think I'd remember how good it was", wine19);
        Review review96 = new Review("My dog prefers the beer I give him.", wine19);

        Review review97 = new Review("I'm not a fan, but then I like cheap beer", wine20);
        Review review98 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine20);
        Review review99 = new Review("Save your money!", wine20);
        Review review100 = new Review("I was surpised. This works just fine.", wine20);
        Review review101 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine20);

        Review review102 = new Review("The second bottle was better than the first", wine21);
        Review review103 = new Review("I just wanted to write a review...I don't know who good this is", wine21);
        Review review104 = new Review("Is this french?", wine21);
        Review review105 = new Review("I had enough of this- you'd think I'd remember how good it was", wine21);
        Review review106 = new Review("My dog prefers the beer I give him.", wine21);

        Review review107= new Review("I'm not a fan, but then I like cheap beer", wine22);
        Review review108 = new Review("I drink this to pretend I have class. I'm not sure if it's good or not.", wine22);
        Review review109 = new Review("Save your money!", wine22);
        Review review110 = new Review("I was surpised. This works just fine.", wine22);
        Review review111 = new Review("I don't who 'save your money' is, but this is as cheap as it tastes.", wine22);



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
        reviewRepo.save(review23);
        reviewRepo.save(review24);
        reviewRepo.save(review25);
        reviewRepo.save(review26);
        reviewRepo.save(review27);
        reviewRepo.save(review28);
        reviewRepo.save(review29);
        reviewRepo.save(review30);
        reviewRepo.save(review31);
        reviewRepo.save(review32);
        reviewRepo.save(review33);
        reviewRepo.save(review34);
        reviewRepo.save(review35);
        reviewRepo.save(review36);
        reviewRepo.save(review37);
        reviewRepo.save(review38);
        reviewRepo.save(review39);
        reviewRepo.save(review40);
        reviewRepo.save(review41);
        reviewRepo.save(review42);
        reviewRepo.save(review43);
        reviewRepo.save(review44);
        reviewRepo.save(review45);
        reviewRepo.save(review46);
        reviewRepo.save(review47);
        reviewRepo.save(review48);
        reviewRepo.save(review49);
        reviewRepo.save(review50);
        reviewRepo.save(review51);
        reviewRepo.save(review52);
        reviewRepo.save(review53);
        reviewRepo.save(review54);
        reviewRepo.save(review55);
        reviewRepo.save(review56);
        reviewRepo.save(review57);
        reviewRepo.save(review58);
        reviewRepo.save(review59);
        reviewRepo.save(review60);
        reviewRepo.save(review61);
        reviewRepo.save(review62);
        reviewRepo.save(review63);
        reviewRepo.save(review64);
        reviewRepo.save(review65);
        reviewRepo.save(review66);
        reviewRepo.save(review67);
        reviewRepo.save(review68);
        reviewRepo.save(review69);
        reviewRepo.save(review70);
        reviewRepo.save(review71);
        reviewRepo.save(review72);
        reviewRepo.save(review73);
        reviewRepo.save(review74);
        reviewRepo.save(review75);
        reviewRepo.save(review76);
        reviewRepo.save(review77);
        reviewRepo.save(review78);
        reviewRepo.save(review79);
        reviewRepo.save(review80);
        reviewRepo.save(review81);
        reviewRepo.save(review82);
        reviewRepo.save(review83);
        reviewRepo.save(review84);
        reviewRepo.save(review85);
        reviewRepo.save(review86);
        reviewRepo.save(review87);
        reviewRepo.save(review88);
        reviewRepo.save(review89);
        reviewRepo.save(review90);
        reviewRepo.save(review91);
        reviewRepo.save(review92);
        reviewRepo.save(review93);
        reviewRepo.save(review94);
        reviewRepo.save(review95);
        reviewRepo.save(review96);
        reviewRepo.save(review97);
        reviewRepo.save(review98);
        reviewRepo.save(review99);
        reviewRepo.save(review100);
        reviewRepo.save(review101);
        reviewRepo.save(review102);
        reviewRepo.save(review103);
        reviewRepo.save(review104);
        reviewRepo.save(review105);
        reviewRepo.save(review106);
        reviewRepo.save(review107);
        reviewRepo.save(review108);
        reviewRepo.save(review109);
        reviewRepo.save(review110);
        reviewRepo.save(review111);


    }
}
