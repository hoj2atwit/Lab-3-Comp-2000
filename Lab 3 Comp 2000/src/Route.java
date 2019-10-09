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
			in = new Scanner(stationNamesFile);
		} catch (FileNotFoundException e) {
			System.out.printf("Cannot find Orange.txt");
			System.exit(0);
		}
		ArrayList<Station> stations = new ArrayList<Station>();
		while(in.hasNext()) {
			stations.add(new Station(in.next()));
		}
		
	}
}
