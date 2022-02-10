package huseyin.ocal.mybookstore.service;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    void create(BookCreateDto bookCreateDto);

}
