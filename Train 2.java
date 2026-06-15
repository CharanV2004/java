package trainproject;
import java.util.Scanner;

	public class RailwayService {

	    Train[] trains;

	    RailwayService() {
	        trains = new Train[] {
	            new Train(12636, "Vaigai Express", "Madurai", "Chennai",
	                    "07:00", "14:30", "Express", 450),

	            new Train(16101, "Chennai Express", "Chennai", "Coimbatore",
	                    "06:30", "14:00", "Superfast", 550),

	            new Train(12083, "Jan Shatabdi", "Trichy", "Chennai",
	                    "05:45", "10:30", "Shatabdi", 600),

	            new Train(12633, "Kanyakumari Express", "Chennai", "Kanyakumari",
	                    "17:00", "07:15", "Express", 750)
	        };
	    }

	    // 1. List Trains
	    void listTrains() {
	        for (Train t : trains) {
	            printTrain(t);
	        }
	    }

	    // 2. Search Train Number
	    void searchByTrainNumber(Scanner sc) {
	        System.out.print("Enter train number: ");
	        int number = sc.nextInt();

	        for (Train t : trains) {
	            if (t.trainNumber == number) {
	                printTrain(t);
	                return;
	            }
	        }
	        System.out.println("Train not found!");
	    }

	    // 3. Search Station
	    void searchByStation(Scanner sc) {
	        System.out.print("Enter station name: ");
	        sc.nextLine();
	        String station = sc.nextLine();

	        boolean found = false;
	        for (Train t : trains) {
	            if (t.source.equalsIgnoreCase(station)
	                    || t.destination.equalsIgnoreCase(station)) {
	                printTrain(t);
	                found = true;
	            }
	        }
	        if (!found)
	            System.out.println("No trains found!");
	    }

	    // 4. Duration Calculation
	    void calculateDuration(Scanner sc) {
	        System.out.print("Enter train number: ");
	        int number = sc.nextInt();

	        for (Train t : trains) {
	            if (t.trainNumber == number) {
	                int dep = convertToMinutes(t.departureTime);
	                int arr = convertToMinutes(t.arrivalTime);

	                if (arr < dep) arr += 24 * 60;

	                int duration = arr - dep;
	                System.out.println("Journey Duration: "
	                        + duration / 60 + " hrs " + duration % 60 + " mins");
	                return;
	            }
	        }
	        System.out.println("Train not found!");
	    }

	    // 5. Ticket Price Viewer
	    void viewTicketPrice(Scanner sc) {
	        System.out.print("Enter train number: ");
	        int number = sc.nextInt();

	        for (Train t : trains) {
	            if (t.trainNumber == number) {
	                System.out.println("Ticket Price: ₹" + t.ticketPrice);
	                return;
	            }
	        }
	        System.out.println("Train not found!");
	    }

	    // 6. Train Type Filter
	    void filterByType(Scanner sc) {
	        System.out.print("Enter train type: ");
	        sc.nextLine();
	        String type = sc.nextLine();

	        boolean found = false;
	        for (Train t : trains) {
	            if (t.trainType.equalsIgnoreCase(type)) {
	                printTrain(t);
	                found = true;
	            }
	        }
	        if (!found)
	            System.out.println("No trains of this type!");
	    }

	    // 7. Summary
	    void summary() {
	        System.out.println("Total Trains: " + trains.length);

	        for (Train t : trains) {
	            System.out.println(t.trainName + " (" + t.trainType + ")");
	        }
	    }

	    // Utility Methods
	    void printTrain(Train t) {
	        System.out.println("\nTrain No: " + t.trainNumber);
	        System.out.println("Name: " + t.trainName);
	        System.out.println("Route: " + t.source + " → " + t.destination);
	        System.out.println("Time: " + t.departureTime + " - " + t.arrivalTime);
	        System.out.println("Type: " + t.trainType);
	        System.out.println("Price: ₹" + t.ticketPrice);
	    }

	    int convertToMinutes(String time) {
	        String[] parts = time.split(":");
	        return Integer.parseInt(parts[0]) * 60
	                + Integer.parseInt(parts[1]);
	    }
	}