package com.capg.springboot.service;

import com.capg.springboot.entity.Booking;

public interface BookingService
{

	Booking addBooking(Booking add);
    Booking updateBooking(Booking add);
	Booking removeBooking(Booking add);
	
}