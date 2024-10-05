public class Booking {
	private String passengerName;
	private char gender;
	private int seatnumber;
	private String trackId;
	private String from;
	private String to;
	protected String phoneNumber;

	public Booking(String passengerName, char gender, int seatnumber, int i, String from, String to,
			String phoneNumber) {
		super();
		this.passengerName = passengerName;
		this.gender = gender;
		this.seatnumber = this.seatnumber;
		this.trackId = trackId;
		this.from = from;
		this.to = to;
		this.phoneNumber = phoneNumber;
	}

	// public Booking(String passengerName2, char gender2, String trackerId, int
	// seatNumber2, String passengerName3,
	// String from2, String to2) {
	// TODO Auto-generated constructor stub
	// }

	public String getPassengerName() {

		return passengerName;
	}

	public char getGender() {
		return gender;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public String getTrackId() {
		return trackId;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getPhone() {
		return phoneNumber;
	}

}
