
public class FlightList {
	private Flight[] flights;
	private Integer amountOfFlights;
	
	public FlightList(Integer flightListSize) {
		this.flights = new Flight[flightListSize];
		this.amountOfFlights = 0;
		
	}
	
	
	public void addDetails(String destination,Integer hours,Integer minutes) {
		this.flights[this.amountOfFlights] = new Flight(destination, hours, minutes);
		this.amountOfFlights++; 
	}
	
	public String toString() {
        String FlightListDetails = new String();
        if(this.amountOfFlights!=0)
            for (int index = 0; index < this.amountOfFlights; index++)
            	FlightListDetails += this.flights[index] + "\n";
        else
        	FlightListDetails+="Flight list is empty";
        return FlightListDetails;
    }
}
