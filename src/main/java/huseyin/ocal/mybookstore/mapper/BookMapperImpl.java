package huseyin.ocal.mybookstore.mapper;

import huseyin.ocal.mybookstore.dto.BookCreateDto;
import huseyin.ocal.mybookstore.dto.BookDto;
import huseyin.ocal.mybookstore.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toBook(BookCreateDto bookCreateDto) {
        return Book.builder()
            .name(bookCreateDto.getName())
            .description(bookCreateDto.getDescription())
            .build();
    }

    @Override
    public BookDto toBookDto(Book book) {
        return BookDto.builder()
            .id(book.getId())
            .createdDate(book.getCreatedDate())
            .updatedDate(book.getUpdatedDate())
            .name(book.getName())
            .description(book.getDescription())
            .build();
    }
}
