package gift.wishes.restapi.dto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import gift.core.PagedDto;
import gift.core.domain.product.Product;
import gift.wishes.service.WishDto;

import java.util.List;

@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public record PagedWishResponse(
        Integer page,
        Integer size,
        Long totalElements,
        Integer totalPages,
        List<WishResponse> contents
) {
    public static PagedWishResponse from(PagedDto<WishDto> pagedDto) {
        return new PagedWishResponse(
                pagedDto.page(),
                pagedDto.size(),
                pagedDto.totalElements(),
                pagedDto.totalPages(),
                pagedDto.contents().stream()
                        .map(WishResponse::from)
                        .toList()
        );
    }
}