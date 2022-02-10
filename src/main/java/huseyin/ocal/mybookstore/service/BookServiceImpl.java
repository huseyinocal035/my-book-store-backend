package huseyin.ocal.mybookstore.service;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.entity.Book;
import huseyin.ocal.mybookstore.mapper.BookMapper;
import huseyin.ocal.mybookstore.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void create(BookCreateDto bookCreateDto) {
        Book book = bookMapper.toBook(bookCreateDto);
        bookRepository.save(book);
    }
}
