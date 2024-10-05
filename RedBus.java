import java.util.Random;

class RedBus {
  static Booking[] bookings;

  public RedBus(int size) {
    bookings = new Booking[size];
  }

  public void bookSeats(int seatNumber, String passengerName, char gender, String from, String to, String phoneNumber) {
    Booking booking = new Booking(passengerName, gender, trackerId(passengerName, phoneNumber), seatNumber,
        passengerName, from, to);
    if (bookings[seatNumber - 1] != null) {
      System.out.println("Seat not available or invalid seat number.");
    } else {
      bookings[seatNumber - 1] = booking;
      System.out.println("Seat booked successfully for " + passengerName);
    }
  }

  public int trackerId(String name, String phNo) {
    Random random = new Random();
    int no = 10000 + random.nextInt(90000);
    String z = name.substring(0, 4) + no + phNo.substring(phNo.length() - 4);

    int x = Integer.parseInt(z);
    return x;
  }

  public void displayConfirmed() {
    for (Booking b : bookings) {
      if (b != null) {
        System.out.println(b.getPassengerName() + " " + b.getSeatnumber() + " " + b.getFrom() + " " + b.getGender());

      }
    }

  }

  public void displayAllPassengersData() {
    System.out.println(bookings);

  }

  public void search(String passengerName) {

  }

  public void search(int seatNumber) {

  }

  public void cancelBooking(int seatNumber) {

  }

  public void showAvailableSeats() {

  }

}
