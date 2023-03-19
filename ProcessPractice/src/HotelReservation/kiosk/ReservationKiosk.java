package HotelReservation.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HotelReservation.Customer.Customer;
import HotelReservation.RoomInfo.RoomInfo;

public class ReservationKiosk {

	private String name;
	private String kindOfReservation;
	private int people;
	private String kindsOfRoom;
	private Scanner scanner = new Scanner(System.in);
	private RoomInfo roominfo = new RoomInfo();

	public void ReservationKiosk(Customer coutomer) {
		while (true) {
			try {
				cost();
				System.out.println("예약자 이름 :");
				name = scanner.nextLine();
				System.out.println("원하시는 객실형태를 입력해주세요");
				kindsOfRoom = scanner.nextLine();
				System.out.println("원하시는 숙박형태를 선택해주세요");
				System.out.println("1. 대실 , 2. 숙박");
				kindOfReservation = scanner.nextLine();
				System.out.println("예약 인원 수 : ");
				people = scanner.nextInt();
				scanner.nextLine();
				boolean isBlank = name.isBlank() || kindsOfRoom.isBlank() || kindOfReservation.isBlank();
				boolean isEqualKindOfReservation = kindOfReservation.equals("대실") || kindOfReservation.equals("숙박");
				if (isBlank) {
					System.out.println("모두 입력해주세요");
					continue;
				}
				if (!isEqualKindOfReservation) {
					System.out.println("숙박형태가 올바르지 못합니다.");
					continue;
				}
				if (people < 1) {
					System.out.println("인원 입력이 잘못되었습니다. 1인 이상이어야합니다.");
					continue;
				}
				List<Customer> customers = new ArrayList<>();
				customers.add(new Customer(name, kindOfReservation, people, kindsOfRoom));
				System.out.println(customers.toString());
				kindsOfRoom = kindsOfRoom.toUpperCase();
				System.out.println("숙박결제가 완료 되었습니다.");
				confirmReservation(customers);
				break;
			} catch (Exception exception) {
				System.out.println("입력값이 잘못되엇습니다.");
				continue;
			}
		}
	}

	public void cost() {

		List<RoomInfo> roomInfoList = new ArrayList<>();
		roomInfoList.add(new RoomInfo("Standard", 1, 30_000));
		roomInfoList.add(new RoomInfo("TwinRoom", 1, 40_000));
		roomInfoList.add(new RoomInfo("Luxury", 1, 55_000));
		roomInfoList.add(new RoomInfo("Standard", 2, 50_000));
		roomInfoList.add(new RoomInfo("TwinRoom", 2, 70_000));
		roomInfoList.add(new RoomInfo("Luxury", 2, 90_000));
	}

	public void confirmReservation(List<Customer> customers) {
		String checkName;
		String checkKindsOfReservation;
		System.out.println("예약 확인 시스템입니다. ");
		System.out.println("예약자 이름을 입력하세요 : ");
		checkName = scanner.nextLine();
		System.out.println("예약 종류를 입력하세요 : ");
		checkKindsOfReservation = scanner.nextLine();
		for (Customer customer : customers) {
			if (customer.getName().equals(checkName)) {
				if (customer.getKindOfReservation().equals(checkKindsOfReservation)) {
					System.out.println(customer.toString());
				} 
					System.out.println("예약리스트에 없습니다.");
					break;
			}
		}
	}
}
