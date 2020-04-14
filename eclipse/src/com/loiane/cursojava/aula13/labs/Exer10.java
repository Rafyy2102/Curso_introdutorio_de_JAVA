package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		/*10. Faça um programa que peça a temperatura em graus 
		 * Celsius, transforme e mostre a temperatura em graus 
		 * Farenheit.
		  F= (5 * (C - 32) / 9)*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a Temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		
		
		double farenheit = ((celsius * 1.8) + 32);
		System.out.println("A temperatura : "+ celsius + "C é igual a " + farenheit + "F");
	
	
	}

}
