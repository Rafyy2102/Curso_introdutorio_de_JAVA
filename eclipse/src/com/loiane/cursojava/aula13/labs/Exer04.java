package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		//4. Fa�a um programa que pe�a as 4 notas bimestral e mostre a m�dia.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com 1� Nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Entre com 2� Nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Entre com 3� Nota: ");
		double nota3 = scan.nextDouble();

		System.out.print("Entre com 4� Nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.print("A m�dia �: "+ media);
	}

}
