package com.hotelmanagement.Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hotelmanagement.Booking.Model.BookingObject;
import com.hotelmanagement.Booking.Repository.BookingInterface;



@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingInterface bookinginterface;
	
	@GetMapping(path="/show")
	 public List<BookingObject> getAllBookings(){
        return bookinginterface.findAll();
    }

	 
	
    
}
