package kfiddle.demo.repositories;


import kfiddle.demo.models.Region;
import org.springframework.data.repository.CrudRepository;

public interface RegionRepository extends CrudRepository<Region, Long> {

    Region findByRegion(String region);



}
