package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		/*11. Fa�a um programa que pe�a 2 n�meros inteiros e 
		 * um n�emroreal. Calcule e mostre:
		 a) o produto do dobro do primeiro com metade do segundo.
		 b) a soma do triplo do primeiro com terceir.
		 c) o terceiro elevado ao cubo.*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero inteiro: ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com um outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		
		System.out.print("Entre com o um n�mero real: ");
		double num3 = scan.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2);
		double resultado2 = (num1 * 3) + num3;
		double resultado3 = Math.pow(num3, 3);
		
		System.out.println("Resultado 1 : "+resultado1); 
		System.out.println("Resultado 2 : "+resultado2);
		System.out.println("Resultado 3 : "+resultado3);
		
	}

}
