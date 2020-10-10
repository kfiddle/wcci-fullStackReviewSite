package kfiddle.demo.repositories;

import kfiddle.demo.models.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {


}
