
public class Station {
	private String name;
	private LinkedQueue<Passenger> passengers;
	private boolean hasPassengers = false;
	
	public Station(String name, LinkedQueue<Passenger> passengers) {
		this.name = name;
		this.passengers = passengers;
	}	
	
	public Station(String name) {
		this(name, new LinkedQueue<Passenger>());
	}
	
	public void addPassenger(Passenger p) {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isHasPassengers() {
		return hasPassengers;
	}
	
	public void setHasPassengers(boolean hasPassengers) {
		this.hasPassengers = hasPassengers;
	}
	
	
}
