import java.util.*;

class Train {
    int trainNo;
    String trainName;
    int seats;
    int fare;

    Train(int trainNo, String trainName, int seats, int fare) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.seats = seats;
        this.fare = fare;
    }
}

public class RailwayTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Available trains list
        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train(101, "Express Mail", 30, 150));
        trains.add(new Train(102, "Rajdhani Express", 20, 200));
        trains.add(new Train(103, "Superfast Local", 25, 120));

        while (true) {
            System.out.println("\n===== RAILWAY TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Trains");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Available Trains ---");
                    for (Train t : trains) {
                        System.out.println("Train No: " + t.trainNo +
                                " | Name: " + t.trainName +
                                " | Seats: " + t.seats +
                                " | Fare: ₹" + t.fare);
                    }
                    break;

                case 2:
                    System.out.print("Enter Train Number: ");
                    int trainNo = sc.nextInt();
                    Train selectedTrain = null;

                    for (Train t : trains) {
                        if (t.trainNo == trainNo) {
                            selectedTrain = t;
                            break;
                        }
                    }

                    if (selectedTrain == null) {
                        System.out.println("❌ Invalid Train Number!");
                        break;
                    }

                    System.out.print("Enter Your Name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();

                    System.out.print("Enter Number of Seats: ");
                    int seatCount = sc.nextInt();

                    if (seatCount <= selectedTrain.seats) {
                        int totalFare = seatCount * selectedTrain.fare;
                        selectedTrain.seats -= seatCount;

                        System.out.println("\n✔ Ticket Booked Successfully!");
                        System.out.println("Passenger Name: " + name);
                        System.out.println("Train: " + selectedTrain.trainName);
                        System.out.println("Seats Booked: " + seatCount);
                        System.out.println("Total Fare: ₹" + totalFare);
                    } else {
                        System.out.println("❌ Not Enough Seats! Available: "
                                + selectedTrain.seats);
                    }
                    break;

                case 3:
                    System.out.println("🙏 Thank you for using Railway Booking System!");
                    return;

                default:
                    System.out.println("❌ Invalid Option! Try Again.");
            }
        }
    }
}
