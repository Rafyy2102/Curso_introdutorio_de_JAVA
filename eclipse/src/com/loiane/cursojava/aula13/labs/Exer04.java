package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		//4. Faça um programa que peça as 4 notas bimestral e mostre a média.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com 1º Nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Entre com 2º Nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Entre com 3º Nota: ");
		double nota3 = scan.nextDouble();

		System.out.print("Entre com 4º Nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.print("A média é: "+ media);
	}

}
