package Files;

import java.util.Scanner;

public class CallMethods_ {
	
	public static void main(String[] args) {
		
		Scanner jeff = new Scanner(System.in);
		
		//1
		System.out.println("Upgift 1:");
		System.out.println(Mylibrary.volumeToMass(Solidtable_.IRON, 80));
		//2
		System.out.println("Upgift 2:");
		System.out.println(Mylibrary.svtDistance(2.8, 60)+" Distans");
		//3
		System.out.println("Upgift 3:");
		System.out.println(Fluidtable_.H20.heatCapacity*5+" W");
		//4
		System.out.println("Upgift 4:");
		System.out.println(Mylibrary.pressureUnderWater(100));
		//5
		System.out.println("Upgift 5:");
		System.out.println(Mylibrary.velocityToHeight(50) + 180);
		//6
		System.out.println("Upgift 6:");
		//7
		System.out.println("Upgift 7:");
		int summa = 0;
		for (int l = 10; l > 0.5; ) {
			l -= l * 0.01;
			summa++;
		}
		System.out.println(summa + "gånger");
	}
	
}
