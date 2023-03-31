package HotelReservation.Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HotelReservation.RoomInfo.RoomInfo;

public class RoomDto {
	private String kindOfreservation;
	private String kindOfRooms;
	private int costOfRoom;
	List<RoomDto> roomList = new ArrayList<>();
	public void selectRoom() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("예약 객실  : " );
		kindOfRooms = scanner.nextLine();
		kindOfRooms = kindOfRooms.toUpperCase();
		System.out.println("숙박 형태 숙박/대실 : ");
		kindOfreservation = scanner.nextLine();
		RoomDto rooms = new RoomDto();
		
	}	
	public String getKindOfRooms() {
		return kindOfRooms;
	}
	public void setKindOfRooms(String kindOfRooms) {
		this.kindOfRooms = kindOfRooms;
	}
	public int getCostOfRoom() {
		return costOfRoom;
	}
	public String getKindOfreservation() {
		return kindOfreservation;
	}
	public void setKindOfreservation(String kindOfreservation) {
		this.kindOfreservation = kindOfreservation;
	}
	public void setCostOfRoom(int costOfRoom) {
		this.costOfRoom = costOfRoom;
	
	}
	public RoomDto(String kindOfreservation, String kindOfRooms, int costOfRoom) {
		this.kindOfreservation = kindOfreservation;
		this.kindOfRooms = kindOfRooms;
		this.costOfRoom = costOfRoom;
	}
	public RoomDto() {
	}
	@Override
	public String toString() {
		return "RoomDto [kindOfreservation=" + kindOfreservation + ", kindOfRooms=" + kindOfRooms + ", costOfRoom="
				+ costOfRoom + "]";
	}
	public List<RoomDto> getRoomList() {
		return roomList;
	}
	public void setRoomList(List<RoomDto> roomList) {
		this.roomList = roomList;
	}
	public boolean isEmptyRoom() {
		boolean result = kindOfreservation.isBlank() ||
				kindOfRooms.isBlank();
		return result;		
	} 
	public List<RoomDto> addRoomList() {
		roomList.add(new RoomDto("대실", "STANDARD",30000));
		roomList.add(new RoomDto("대실", "TWINROOM",50000));
		roomList.add(new RoomDto("대실", "LUXURY",55000));
		roomList.add(new RoomDto("숙박", "STANDARD",60000));
		roomList.add(new RoomDto("숙박", "TWINROOM",80000));
		roomList.add(new RoomDto("숙박", "LUXURY",90000));
		return roomList;
	}
	public boolean checkRoom() {
		boolean result = true;
		for(RoomDto room : roomList) {
			if(room.getKindOfRooms().equals(kindOfRooms))
				result = false;
		}
		return result;
	}
	public boolean checkReservation() {
		boolean result = !(kindOfreservation.equals("대실") || kindOfreservation.equals("숙박"));
		return result;
	}
	
}
