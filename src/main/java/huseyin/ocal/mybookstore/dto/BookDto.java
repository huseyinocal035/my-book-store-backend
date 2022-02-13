package huseyin.ocal.mybookstore.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private Long id;

    private Instant createdDate;

    private Instant updatedDate;

    private String name;

    private String description;
}
