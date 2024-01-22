package org.ada.busbookingapi.controller;

import org.ada.busbookingapi.BookingService;
import org.ada.busbookingapi.domain.dto.BookingDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1//booking")
public class BookingController {

    private final BookingService<BookingDto> bookingService;

    public BookingController(BookingService<BookingDto> bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping()
   public ResponseEntity<?> saveBooking(@RequestBody  BookingDto bookingDto) {
        bookingService.save(bookingDto);
       return new ResponseEntity<>("save", HttpStatus.CREATED);
   }
   @GetMapping("list")
    public ResponseEntity<?> getAllBookings(){
       List<BookingDto> bookings = bookingService.findAll();
       return new ResponseEntity<>(bookings, HttpStatus.FOUND);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBooking (@PathVariable("id") Integer id)
        throws Exception {
        bookingService.delete(Integer.valueOf(id.toString()));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}



