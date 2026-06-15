package trainproject;

public class Train {
	

	    int trainNumber;
	    String trainName;
	    String source;
	    String destination;
	    String departureTime;
	    String arrivalTime;
	    String trainType;
	    int ticketPrice;

	    Train(int trainNumber, String trainName, String source,
	          String destination, String departureTime,
	          String arrivalTime, String trainType, int ticketPrice) {

	        this.trainNumber = trainNumber;
	        this.trainName = trainName;
	        this.source = source;
	        this.destination = destination;
	        this.departureTime = departureTime;
	        this.arrivalTime = arrivalTime;
	        this.trainType = trainType;
	        this.ticketPrice = ticketPrice;
	    }
	}