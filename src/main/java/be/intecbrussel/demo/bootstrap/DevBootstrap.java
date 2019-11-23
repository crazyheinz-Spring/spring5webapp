package be.intecbrussel.demo.bootstrap;

import be.intecbrussel.demo.model.Author;
import be.intecbrussel.demo.model.Book;
import be.intecbrussel.demo.model.Publisher;
import be.intecbrussel.demo.repositories.AuthorRepository;
import be.intecbrussel.demo.repositories.BookRepository;
import be.intecbrussel.demo.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher lannoo = new Publisher("lanno","brussel");
        Publisher intec = new Publisher("intec","sleidinge");

        publisherRepository.save(lannoo);
        publisherRepository.save(intec);

        Author eric = new Author("Eric","Evans");
        Book book1 = new Book("boekje","13542",lannoo);
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book1);



        Author monika = new Author("Monika","Conkova");
        Book book2 = new Book("hoe slim zijn","2544",intec);
        monika.getBooks().add(book2);
        book2.getAuthors().add(monika);

        authorRepository.save(monika);
        bookRepository.save(book2);



    }
}
