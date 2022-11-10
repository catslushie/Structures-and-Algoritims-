
public class Flight {
	
	String destination;
	Integer hours;
	Integer minutes;

	public void addDetails(String destination, Integer hours, Integer minutes) {
		this.destination = destination;
		this.hours = hours;
		this.minutes = minutes;
	}
	
    public Flight(String destination, Integer hours, Integer minutes) {
        this.destination = destination;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String toString(){
        String flightDetails=new String();
        if(this.hours<10)
            flightDetails+="0";
        flightDetails+=this.hours+":";
        if(this.minutes<10)
            flightDetails+="0";
        flightDetails+=this.minutes;
        flightDetails+=" "+this.destination;
        return flightDetails;
    }
    

}
