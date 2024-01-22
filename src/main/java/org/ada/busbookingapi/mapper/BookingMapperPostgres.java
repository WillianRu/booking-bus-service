package org.ada.busbookingapi.mapper;

import org.ada.busbookingapi.domain.dto.BookingDto;
import org.ada.busbookingapi.domain.entity.BookingPostgres;
import org.ada.busbookingapi.mapper.base.IBaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface BookingMapperPostgres extends IBaseMapper {
    @Mapping(source = "id", target = "id", qualifiedByName = "objectToInteger")
    BookingPostgres toEntity(BookingDto dto);
    BookingDto toDto(BookingPostgres entity);
    List<BookingPostgres> toEntityList(List<BookingDto> dtoList);
    List<BookingDto> toDtoList(List<BookingPostgres> entityList);
    @Named("objectToInteger")
    default Integer objectToInteger(Object obj){
        return Integer.valueOf(obj.toString());
    }
}
