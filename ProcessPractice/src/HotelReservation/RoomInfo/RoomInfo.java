package HotelReservation.RoomInfo;

import java.util.ArrayList;
import java.util.List;

public class RoomInfo {
	private String kindsOfRoomClass;
	private int KindOfReservation;
	private int Cost;

	public RoomInfo(String kindsOfRoomClass, int kindOfReservation, int cost) {
		this.kindsOfRoomClass = kindsOfRoomClass;
		this.KindOfReservation = kindOfReservation;
		this.Cost = cost;
	}

	public RoomInfo() {
	}

	public int getKindOfReservation() {
		return KindOfReservation;
	}

	public void setKindOfReservation(int kindOfReservation) {
		KindOfReservation = kindOfReservation;
	}

	public String getKindsOfRoomClass() {
		return kindsOfRoomClass;
	}

	public void setKindsOfRoomClass(String kindsOfRoomClass) {
		this.kindsOfRoomClass = kindsOfRoomClass;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}
}
