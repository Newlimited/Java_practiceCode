package HotelReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import HotelReservation.Customer.Customer;
import HotelReservation.RoomInfo.RoomInfo;
import HotelReservation.kiosk.ReservationKiosk;

public class HotelReservationMain {

	private static ReservationKiosk kiosk = new ReservationKiosk();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("****Welcome to Newlimit's Hotel****");
		System.out.println("우리 호텔은 대실은 3시간, 숙박은 15시 입실 ~ 익일 13시 퇴실입니다.");
		System.out.println("기본 2인이며 1인이 추가될경우 1만원의 추가요금이 발생합니다.");
		System.out.println("객실의 종류는 Standard, TwinRoom, Luxury 입니다.");
		System.out.println("가격표는 아래와 같습니다.");
		System.out.println("대실금액  숙박금액");
		System.out.println("30,000  50,000");
		System.out.println("40,000  70,000");
		System.out.println("55,000  90,000");

		Customer customers = new Customer();
		kiosk.ReservationKiosk(customers);
	}
}