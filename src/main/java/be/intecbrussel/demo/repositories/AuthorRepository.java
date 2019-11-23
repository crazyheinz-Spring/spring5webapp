package be.intecbrussel.demo.repositories;

import be.intecbrussel.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
