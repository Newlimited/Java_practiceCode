package HotelReservation.RoomInfo;

public class RoomInfo {
	private String KindOfRooms;
	private String kindOfReservation;
	private int costOfRoom;
	
	public RoomInfo() {
	}
	public RoomInfo(String kindOfRooms, String kindOfReservation, int costOfRoom) {
		KindOfRooms = kindOfRooms;
		this.kindOfReservation = kindOfReservation;
		this.costOfRoom = costOfRoom;
	}
	public String getKindOfReservation() {
		return kindOfReservation;
	}
	public void setKindOfReservation(String kindOfReservation) {
		this.kindOfReservation = kindOfReservation;
	}
	public String getKindOfRooms() {
		return KindOfRooms;
	}
	public void setKindOfRooms(String kindOfRooms) {
		KindOfRooms = kindOfRooms;
	}
	public int getCostOfRoom() {
		return costOfRoom;
	}
	public void setCostOfRoom(int costOfRoom) {
		this.costOfRoom = costOfRoom;
	}
	@Override
	public String toString() {
		return "RoomInfo [KindOfRooms=" + KindOfRooms + ", kindOfReservation=" + kindOfReservation + ", costOfRoom="
				+ costOfRoom + "]";
	}
	
	
}
