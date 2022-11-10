
public class FlightListTest {


	public static void main(String[] args) {
		
		Integer flightListSize = Input.getInteger("flightListSize: ");
		FlightList flights = new FlightList(flightListSize);
		
		String destination;
		Integer hours;
		Integer minutes;
		
		
		Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: add");
            System.out.println("2: sort");
            System.out.println("3: display");
            option = Input.getInteger("input option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    try{
                        destination = Input.getString("destination: ");
                        hours=Input.getInteger("hours: ");
                        minutes=Input.getInteger("minutes: ");
                        flights.addDetails(destination, hours, minutes);
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("add invalid - array full");
                    }
                    break;
                case 2:
                    System.out.println(flights);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);

	}

}
