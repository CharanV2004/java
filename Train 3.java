package trainproject;
import java.util.Scanner;

	public class RailwayApp {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        RailwayService service = new RailwayService();
	        int choice;

	        do {
	            System.out.println("\n--- RAILWAY TIME TABLE VIEWER ---");
	            System.out.println("1. List Trains");
	            System.out.println("2. Search Train Number");
	            System.out.println("3. Search Station");
	            System.out.println("4. Duration Calculation");
	            System.out.println("5. Ticket Price Viewer");
	            System.out.println("6. Train Type Filter");
	            System.out.println("7. Summary");
	            System.out.println("8. Exit");
	            System.out.print("Enter choice: ");

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    service.listTrains();
	                    break;
	                case 2:
	                    service.searchByTrainNumber(sc);
	                    break;
	                case 3:
	                    service.searchByStation(sc);
	                    break;
	                case 4:
	                    service.calculateDuration(sc);
	                    break;
	                case 5:
	                    service.viewTicketPrice(sc);
	                    break;
	                case 6:
	                    service.filterByType(sc);
	                    break;
	                case 7:
	                    service.summary();
	                    break;
	                case 8:
	                    System.out.println("Thank you!");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 8);

	        sc.close();
	    }
	}