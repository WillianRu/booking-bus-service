package org.ada.busbookingapi.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Builder
@Document(collection = "booking")
public class BookingMongo {

    @Id
    private String id;
    private String name;
    private String email;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private String duration;

}
