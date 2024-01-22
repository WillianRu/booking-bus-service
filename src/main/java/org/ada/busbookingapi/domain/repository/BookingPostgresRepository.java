package org.ada.busbookingapi.domain.repository;

import org.ada.busbookingapi.domain.entity.BookingPostgres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingPostgresRepository extends JpaRepository<BookingPostgres, Integer> {
}