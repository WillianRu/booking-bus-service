package org.ada.busbookingapi.domain.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDate;
import java.time.LocalTime;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record BookingDto(
        Object id,
        String name,
        String email,
        String origin,
        String destination,
        LocalDate departureDate,
        LocalTime departureTime,
        String duration
) {
}
