package HotelReservation.CustomerInfo;

public class CustomerInfo {
	private String name;
	private String telNumber;
	private int countOfReservation;
	public CustomerInfo() {
	}
	public CustomerInfo(String name, String telNumber, int countOfReservation) {
		this.name = name;
		this.telNumber = telNumber;
		this.countOfReservation = countOfReservation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	public int getCountOfReservation() {
		return countOfReservation;
	}
	public void setCountOfReservation(int countOfReservation) {
		this.countOfReservation = countOfReservation;
	}
	@Override
	public String toString() {
		return "CustomerInfo [name=" + name + ", telNumber=" + telNumber + ", countOfReservation=" + countOfReservation
				+ "]";
	}
	
	
	
	
}
