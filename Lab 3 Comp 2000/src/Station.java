
public class Station {
	private String name;
	private LinkedQueue<Passenger> passengers;
	
	public Station(String name, LinkedQueue<Passenger> passengers) {
		this.name = name;
		this.passengers = passengers;
	}	
	
	public Station(String name, int numPass) {
		this(name, new LinkedQueue<Passenger>(numPass));
	}
	
}
