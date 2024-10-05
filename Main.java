import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RedBus redBus = null;

        try {
            System.out.print("Enter number of seats: ");
            int size = scanner.nextInt();
            redBus = new RedBus(size);

            boolean running = true;
            while (running) {
                System.out.println("\nMenu:");
                System.out.println("1. Book a seat");
                System.out.println("2. Show available seats");
                System.out.println("3. Display confirmed bookings");
                System.out.println("4. Search for a passenger by name");
                System.out.println("5. Search for a booking by seat number");
                System.out.println("6. Cancel a booking");
                System.out.println("7. Exit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch (choice) {
                    case 1:
                        System.out.print("Enter seat number: ");
                        int seatNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline left-over
                        System.out.print("Enter passenger name: ");
                        String passengerName = scanner.nextLine();
                        System.out.print("Enter gender (M/F): ");
                        char gender = scanner.nextLine().charAt(0);
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Enter departure city: ");
                        String from = scanner.nextLine();
                        System.out.print("Enter destination city: ");
                        // scanner.next();
                        // scanner.next();
                        String to = scanner.nextLine();
                        redBus.bookSeats(seatNumber, passengerName, gender, phoneNumber, from, passengerName);
                        break;

                    case 2:
                        redBus.showAvailableSeats();
                        break;

                    case 3:
                        redBus.displayConfirmed();
                        break;

                    case 4:
                        System.out.print("Enter passenger name to search: ");
                        String searchName = scanner.nextLine();
                        redBus.search(searchName);
                        break;

                    case 5:
                        System.out.print("Enter seat number to search: ");
                        int searchSeat = scanner.nextInt();
                        redBus.search(searchSeat);
                        break;

                    case 6:
                        System.out.print("Enter seat number to cancel: ");
                        int cancelSeat = scanner.nextInt();
                        redBus.cancelBooking(cancelSeat);
                        break;

                    case 7:
                        System.out.println("Exiting the system.");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please select again.");
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred in the main method: " + e.getMessage());
        } finally {
            if (redBus != null) {
                redBus.displayConfirmed(); // Optional: show all bookings before exit
            }
            scanner.close();
        }
    }
}