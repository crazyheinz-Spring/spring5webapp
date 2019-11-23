package be.intecbrussel.demo.repositories;

import be.intecbrussel.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
