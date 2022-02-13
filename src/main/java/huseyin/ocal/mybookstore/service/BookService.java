package huseyin.ocal.mybookstore.service;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.dto.BookDto;
import huseyin.ocal.mybookstore.entity.Book;

import java.util.List;

public interface BookService {

    BookDto findOne(Long id);

    List<Book> findAll();

    void create(BookCreateDto bookCreateDto);

    void update(BookCreateDto bookCreateDto, Long id);

    void delete(Long id);
}
