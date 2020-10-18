package kfiddle.demo;


import kfiddle.demo.models.Region;
import kfiddle.demo.models.Review;
import kfiddle.demo.models.Wine;
import kfiddle.demo.repositories.RegionRepository;
import kfiddle.demo.repositories.WineRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest

public class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RegionRepository regionRepo;

    @MockBean
    private WineRepository wineRepo;

    @Test
    public void regionShouldBeOkAndShouldHaveViewWhichListsRegions() throws Exception {
        mockMvc.perform(get("/regions"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("regionsView"))
                .andExpect(model().attributeExists("regions"));
    }

    @Test
    public void shouldBeAbleToViewOneRegion() throws Exception {
        Region chile = new Region("Chile");
        when(regionRepo.findByRegion("Chile")).thenReturn(chile);
        mockMvc.perform(get("/regions/Chile"))
                .andExpect(status().isOk())
                .andExpect(view().name("singleRegionView"))
                .andExpect(model().attributeExists("region"));
    }

    @Test
    public void shouldBeAbleToViewAllWinesFromAllRegions() throws Exception {

        mockMvc.perform(get("/wines"))
                .andExpect(status().isOk())
                .andExpect(view().name("allWinesView"))
                .andExpect(model().attributeExists("allWines"));
    }

    @Test
    public void shouldBeAbleToViewAWine() throws Exception {
        Region france = new Region("France");
        Wine frenchRed = new Wine("FrenchRed", france, "red");
        when(wineRepo.findWineByName("FrenchRed")).thenReturn(frenchRed);
        mockMvc.perform(get("/wines/FrenchRed"))
                .andExpect(status().isOk())
                .andExpect(view().name("singleWineView"))
                .andExpect(model().attributeExists("wine"));
    }

}
