package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		//5. Fa�a um programa que converta metros para cent�metros.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		//1m = 100cm
		double cm = metros * 100;
		System.out.print(metros+ " m � igual a "+ cm + "cm;");
	}

}
