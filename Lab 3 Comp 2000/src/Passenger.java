import java.util.Random;

public class Passenger {
	private int ID;
	private Station destination;

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}
	
	public void randomID() {
		Random rand = new Random();
		int[] IDArr = new int[5];
		for(int i = 0; i <= IDArr.length; i++) {
			IDArr[i] = rand.nextInt(10);
		}
		setID((IDArr[0]*10000) + (IDArr[1]*1000) + (IDArr[2]*100) + (IDArr[3]*10) + (IDArr[4]));
		
	}
	

}
