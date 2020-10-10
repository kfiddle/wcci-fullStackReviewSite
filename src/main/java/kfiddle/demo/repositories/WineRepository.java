package kfiddle.demo.repositories;

import kfiddle.demo.models.Wine;
import org.springframework.data.repository.CrudRepository;

public interface WineRepository extends CrudRepository<Wine, Long> {

    Wine findWineByName(String name);

}
