package de.mamo.store.controller;

import de.mamo.store.entities.BookEntity;
import de.mamo.store.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping
public class RestApi {
    private final BookService bookService;

    public RestApi(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }
}
