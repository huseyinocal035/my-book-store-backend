package huseyin.ocal.mybookstore.controller;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.dto.BookDto;
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
    public ResponseEntity<List<Book>> findAll() {
        List<Book> bookList = bookService.findAll();
        return ResponseEntity.ok(bookList);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<BookDto> findOne(@PathVariable Long id) {
        BookDto bookDto = bookService.findOne(id);
        return ResponseEntity.ok(bookDto);
    }

    @PostMapping("/books")
    public void create(@RequestBody BookCreateDto bookCreateDto) {
        bookService.create(bookCreateDto);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        bookService.delete(id);
        return ResponseEntity.ok("Book ID: " + id + " has been deleted.");
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<String> update(@RequestBody BookCreateDto bookCreateDto, @PathVariable Long id) {
        bookService.update(bookCreateDto, id);
        return ResponseEntity.ok("Book ID: " + id + "has been updated.");
    }
}
