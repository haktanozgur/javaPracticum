package com.haktanozgur.manavKasa;

import java.util.Scanner;

public class manavKasa {
	
	public static float toplam(int armut, int elma, int domates, int muz, int patlican) {
		
		float armutKg = (float) (armut * 2.14);
		float elmaKg = (float) (elma * 3.67);
		float domatesKg = (float) (domates * 1.11);
		float muzKg = (float) (muz * 0.95);
		float patlicanKg = (float) (patlican * 5.00);
		float toplam = armutKg + elmaKg + domatesKg + muzKg + patlicanKg;
		
		return toplam;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo ? : ");	
		int armut = scanner.nextInt();
	    System.out.println("Elma kaç kilo ? : ");	 
		int elma = scanner.nextInt();
	    System.out.println("Domates kaç kilo ? : ");	 
		int domates = scanner.nextInt();
	    System.out.println("Muz kaç kilo ? : ");	 
		int muz = scanner.nextInt();
	    System.out.println("Patlıcan kaç kilo ? : ");	 
		int patlican = scanner.nextInt();
		
		System.out.println("Toplam tutar : " + toplam(armut, elma, domates, muz, patlican));
		
	}
}

