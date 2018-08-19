package com.bharath.flightcheckin.Integration;

import com.bharath.flightcheckin.Integration.dto.Reservation;
import com.bharath.flightcheckin.Integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
