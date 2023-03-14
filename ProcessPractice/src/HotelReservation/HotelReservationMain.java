package HotelReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import HotelReservation.Customer.Customer;
import HotelReservation.RoomInfo.RoomInfo;

public class HotelReservationMain {
	private static String name;
	private static int kindOfReservation;
	private static int people;
	private static String kindsOfRoom;
	public  static void main(String[] args) {
		
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
		while(true) {
		cost();
		System.out.println("예약자 이름 :");
		name = scanner.nextLine();
		System.out.println("원하시는 객실형태를 입력해주세요");
		kindsOfRoom = scanner.nextLine();
		System.out.println("원하시는 숙박형태를 선택해주세요");
		System.out.println("1. 대실 , 2. 숙박");
		kindOfReservation = scanner.nextInt();
		System.out.println("예약 인원 수 : ");
		people  = scanner.nextInt();
		if(name.isBlank()) {
			System.out.println("모두 입력해주세요");
			continue;
		}
		if(kindOfReservation > 3) {
			System.out.println("입력숫자는 1 혹은 2 입니다.");
			continue;
		}
		if(people < 1) {
			System.out.println("인원 입력이 잘못되었습니다. 1인 이상이어야합니다.");
			continue;
		}
		
		List<Customer> customer = new ArrayList<>();
		customer.add(new Customer(name,kindOfReservation,people,kindsOfRoom));
		System.out.println(customer.toString());
		kindsOfRoom = kindsOfRoom.toUpperCase();
		System.out.println("숙박결제가 완료 되었습니다.");
		break;
		}
		
	}
	private static void cost() {
		
		List<RoomInfo> roomInfo = new ArrayList<>();
		roomInfo.add(new RoomInfo("Standard",1,30_000));
		roomInfo.add(new RoomInfo("TwinRoom",1,40_000));
		roomInfo.add(new RoomInfo("Luxury",1,55_000));
		roomInfo.add(new RoomInfo("Standard",2,50_000));
		roomInfo.add(new RoomInfo("TwinRoom",2,70_000));
		roomInfo.add(new RoomInfo("Luxury",2,90_000));
		

	
		
	}
	}