package de.mamo.store.services;

import de.mamo.store.entities.BookEntity;
import de.mamo.store.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }


}
