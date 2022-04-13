package com.capg.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.repository.BookingRepository;

@Service
@Transactional
public class BookingServiceImplementation implements BookingService{

	/*
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @Override: It informs the compiler that the element isn meant to override an element declared in a superclass
	 */
	@Autowired 
	private BookingRepository bookingrepository;
	
	
	//Add Booking
		public Booking addBooking (Booking add) {
			
			return bookingrepository.save(add);
			
		}
		//Modify Booking
		@Override
		public Booking updateBooking (Booking add)
		{
			return bookingrepository.save(add);
		}	
		//Delete Booking
		@Override
		public Booking removeBooking (Booking add) {
			bookingrepository.delete(add);
			return add;
		}
}