package kfiddle.demo.repositories;

import kfiddle.demo.models.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    Collection<Review> findByWineName(String wine);
}
