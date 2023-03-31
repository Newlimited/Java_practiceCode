package HotelReservation.Main;

import java.util.ResourceBundle.Control;

import HotelReservation.Controller.Controller;
import HotelReservation.Dto.ReservationDto;

public class HotelReservationMain {

	static Controller controller = new Controller(); 
	public static void main(String[] args) {

		controller.reservationStart();
	}

}
