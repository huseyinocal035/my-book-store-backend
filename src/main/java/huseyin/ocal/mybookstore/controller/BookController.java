package huseyin.ocal.mybookstore.controller;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.entity.Book;
import huseyin.ocal.mybookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class BookController {

    private final BookService bookService;

    @GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> bookList = bookService.findAll();
        return ResponseEntity.ok(bookList);
    }

    @PostMapping("books")
    public void create(@RequestBody BookCreateDto bookCreateDto) {
        bookService.create(bookCreateDto);
    }

}
