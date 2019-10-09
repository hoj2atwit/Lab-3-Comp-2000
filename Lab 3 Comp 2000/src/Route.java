import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Route {
	
	public static void main(String[] args) {
		File stationNamesFile = new File("src\\orange.txt");
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		try {
			in.close();
			in = new Scanner(stationNamesFile);
			
			ArrayList<Station> stationsArrList = new ArrayList<Station>();
			while(in.hasNext()) {
				stationsArrList.add(new Station(in.next()));
			}
			Station[] stationsArr = stationsArrList.toArray();
			ArrayList<Passenger> allPassengers = new ArrayList<Passenger>();
			for(int i = 0; i < stationsArr.length; i++) {
				int passAmnt = rand.nextInt(6);
				for(int j = 1; j <= passAmnt; j++) {
					Passenger pass = new Passenger();
					int destIndex = -1;
					while(destIndex != i && destIndex >= 0) {
						destIndex = rand.nextInt(stationsArr.length);
					}
					Station dest = stationsArr[destIndex];
					pass.setDestination(dest);
					pass.randomID();
					boolean copy = true;
					while(allPassengers.size() != 0 && copy) {
						for(int k = 0; k < allPassengers.size(); k++) {
							if(pass.getID() == allPassengers.get(k).getID()) {
								copy = true;
								pass.randomID();
								break;
							}else {
								copy = false;
							}
						}
					}
					stationsArr[j].addPassenger(pass);
				}
			}
			
			printAll(stationsArr);
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.printf("Cannot find Orange.txt");
		}
		
	}
	
	public static void printAll(Station[] stations){
		for(int i = 0; i < stations.length; i++) {
			System.out.printf("-----------------------%n%s%n Passengers:%n%n",stations[i].getName());
			if(stations[i].isHasPassengers()) {
				Passenger pass = stations[i].getPassengers().dequeue();
				while(pass != null) {
					System.out.printf("%d, %s%n", pass.getID(), pass.getDestination().getName());
					pass = stations[i].getPassengers().dequeue();
					
				}
			} else {
				System.out.printf("None%n");
			}
			System.out.printf("========================%n%n");
		}
	}
	
	
}
