package be.intecbrussel.demo.repositories;

import be.intecbrussel.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {


}
