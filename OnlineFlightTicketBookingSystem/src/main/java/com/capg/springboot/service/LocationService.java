package com.capg.springboot.service;

import com.capg.springboot.entity.Location;

public interface LocationService {

	Location addLocation(Location add);

	Location updateLocation(Location add);
	
	Location removeLocation(Location add);
}