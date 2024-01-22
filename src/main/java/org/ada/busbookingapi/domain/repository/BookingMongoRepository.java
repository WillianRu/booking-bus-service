package org.ada.busbookingapi.domain.repository;

import org.ada.busbookingapi.domain.entity.BookingMongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingMongoRepository extends MongoRepository<BookingMongo, String> {

}
