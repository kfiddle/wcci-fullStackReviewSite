package kfiddle.demo;


import kfiddle.demo.models.Region;
import kfiddle.demo.models.Review;
import kfiddle.demo.models.Wine;
import kfiddle.demo.repositories.RegionRepository;
import kfiddle.demo.repositories.ReviewRepository;
import kfiddle.demo.repositories.WineRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RegionRepository regionRepo;

    @Autowired
    private WineRepository wineRepo;

    @Autowired
    private ReviewRepository reviewRepo;

    @Test
    public void regionRepoShouldExist() {
        Region germany = new Region("Germany");
        Region france = new Region("France");
        Region california = new Region("California");

        regionRepo.save(germany);
        regionRepo.save(france);
        regionRepo.save(california);

        entityManager.flush();
        entityManager.clear();

        Region testRegion = regionRepo.findById(germany.getId()).get();
        Region testRegion2 = regionRepo.findByRegion("France");
        assertEquals(germany, testRegion);
        assertEquals(testRegion2, france);
    }

    @Test
    public void wineRepoShouldExist() {
        Region napa = new Region("Napa");
        Wine napaRed = new Wine("NapaRed", napa, "red");

        regionRepo.save(napa);
        wineRepo.save(napaRed);

        entityManager.flush();
        entityManager.clear();

        Wine retrievedWine = wineRepo.findById(napaRed.getId()).get();
        assertEquals(retrievedWine, napaRed);
        assertEquals(retrievedWine.getRegion(), napa);
    }

    @Test
    public void reviewsShouldExistAndWineShouldHaveSomeReviewsForIt() {
        Region napa = new Region("Napa");
        Region ny = new Region("New York");
        Wine napaRed = new Wine("NapaRed", napa, "red");
        Wine newYork = new Wine("NYWhite", ny, "white");
        Review firstReview = new Review("this sucks", napaRed);
        Review secondReview = new Review("this is ok", napaRed);
        Review thirdReview = new Review("this is really bad", napaRed);

        regionRepo.save(napa);
        regionRepo.save(ny);
        wineRepo.save(napaRed);
        wineRepo.save(newYork);
        reviewRepo.save(firstReview);
        reviewRepo.save(secondReview);
        reviewRepo.save(thirdReview);

        entityManager.flush();
        entityManager.clear();

        assertEquals(reviewRepo.findById(firstReview.getId()).get(), firstReview);
        assertThat(wineRepo.findWineByName("NapaRed").getReviews().contains(thirdReview));
        assertThat(wineRepo.findWineByName("NapaRed").getReviews().contains(secondReview));
        assertThat(wineRepo.findWineByName("NapaRed").getReviews().contains(firstReview));
    }


    @Test
    public void regionShouldBeAbleToHaveManyWinesAndAlsoRetrieveSingleWine() {
        Region france = new Region("France");
        Wine frenchRed = new Wine("red wine", france, "red");
        Wine frenchWhite = new Wine("white wine", france, "white");
        Wine frenchWine = new Wine("french wine", france, "red");

        regionRepo.save(france);
        wineRepo.save(frenchRed);
        wineRepo.save(frenchWhite);
        wineRepo.save(frenchWine);

        entityManager.flush();
        entityManager.clear();

        assertThat(regionRepo.findById(france.getId()).get().getWines().contains(frenchRed));
        assertThat(regionRepo.findById(france.getId()).get().getWines().contains(frenchWine));
        assertEquals(wineRepo.findWineByName("red wine"), frenchRed);
    }

    @Test
    public void shouldBeAbleToGetReviewsOfOneSingleWineFromReviewRepo() {
        Region napa = new Region("Napa");
        Region ny = new Region("New York");
        Wine napaRed = new Wine("NapaRed", napa, "red");
        Wine newYork = new Wine("NYWhite", ny, "white");
        Review firstReview = new Review("this sucks", napaRed);
        Review secondReview = new Review("this is ok", napaRed);
        Review thirdReview = new Review("this is really bad", newYork);
        Review fourthReview = new Review("nice", newYork);

        regionRepo.save(napa);
        regionRepo.save(ny);
        wineRepo.save(napaRed);
        wineRepo.save(newYork);
        reviewRepo.save(firstReview);
        reviewRepo.save(secondReview);
        reviewRepo.save(thirdReview);

        entityManager.flush();
        entityManager.clear();

        assertThat(reviewRepo.findByWineName("NapaRed").contains(firstReview));
        assertThat(reviewRepo.findByWineName("NapaRed").contains(secondReview));
        assertThat(reviewRepo.findByWineName("NapaRed").contains(thirdReview));
        assertThat(reviewRepo.findByWineName("NapaRed").contains(fourthReview));
    }

    @Test
    public void shouldBeAbleToViewWinesByColor() {
        Region napa = new Region("Napa");
        Region ny = new Region("New York");
        Wine napaRed = new Wine("NapaRed", napa, "red");
        Wine newYork = new Wine("NYWhite", ny, "white");
        Wine napaRed2 = new Wine("NapaRed2", napa, "red");
        Wine newYork2 = new Wine("NYWhite2", ny, "white");

        regionRepo.save(napa);
        regionRepo.save(ny);
        wineRepo.save(napaRed);
        wineRepo.save(newYork);
        wineRepo.save(napaRed2);
        wineRepo.save(newYork2);

        entityManager.flush();
        entityManager.clear();


        assertThat(wineRepo.findWineByColor("white").contains(napaRed));
        assertThat(wineRepo.findWineByColor("red").contains(newYork));

    }
}






