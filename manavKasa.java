package com.haktanozgur.manavKasa;

import java.util.Scanner;

public class manavKasa {
	
	public static float total(int pear, int apple, int tomato, int banana, int aubergine) {
		
		float pearPrice = (float) (pear * 2.14);
		float applePrice = (float) (apple * 3.67);
		float tomatoPrice = (float) (tomato * 1.11);
		float bananaPrice = (float) (banana * 0.95);
		float auberginePrice = (float) (aubergine * 5.00);
		float totalPrice = pearPrice + applePrice + tomatoPrice + bananaPrice + auberginePrice;
		
		return totalPrice;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo ? : ");	
		int pearKg = scanner.nextInt();
	    System.out.println("Elma kaç kilo ? : ");	 
		int appleKg = scanner.nextInt();
	    System.out.println("Domates kaç kilo ? : ");	 
		int tomatoKg = scanner.nextInt();
	    System.out.println("Muz kaç kilo ? : ");	 
		int bananaKg = scanner.nextInt();
	    System.out.println("Patlıcan kaç kilo ? : ");	 
		int aubergineKg = scanner.nextInt();
		
		System.out.println("Toplam tutar : " + total(pearKg, appleKg, tomatoKg, bananaKg, aubergineKg));
		
	}
}

