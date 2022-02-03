package huseyin.ocal.mybookstore.mapper;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.entity.Book;

public interface BookMapper {

    Book toBook(BookCreateDto bookCreateDto);

}
