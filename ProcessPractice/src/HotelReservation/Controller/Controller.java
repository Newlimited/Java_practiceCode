package HotelReservation.Controller;

import HotelReservation.Service.ReservationService;

public class Controller {
ReservationService reservationService = new ReservationService();

public void reservationStart() {
	reservationService.reservation();
}
}
