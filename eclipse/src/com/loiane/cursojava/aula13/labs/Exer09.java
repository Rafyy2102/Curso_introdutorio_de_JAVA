package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		/*9. Fa�a um programa que pe�a a temperatura em graus Farenheit, 
		 * transforme e mostre a temperatura em graus Celsius.
		 C= (5 * (F - 32) / 9)*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a Temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
		
		
		double celsius = (5 * (farenheit - 32 )/ 9);
		System.out.println("A temperatura : "+ farenheit + "F � igual a " + celsius + "C");
	
		
		
	}

}
