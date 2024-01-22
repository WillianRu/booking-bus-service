package org.ada.busbookingapi.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "booking")
public class BookingPostgres {

    @Id
    @SequenceGenerator(
            name = "booking_id_sequence",
            sequenceName = "booking_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "booking_id_sequence"
            )
    private Integer id;
    private String name;
    private String email;
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private String duration;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingPostgres that = (BookingPostgres) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(departureDate, that.departureDate) && Objects.equals(departureTime, that.departureTime) && Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, origin, destination, departureDate, departureTime, duration);
    }
}
