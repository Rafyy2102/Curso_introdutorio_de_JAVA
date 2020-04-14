package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		//3.Faça um programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.print("Entre com segundo número: ");
		int num2 = scan.nextInt();
		
		int resultado = num1 + num2;
		System.out.print("A soma dos números é: "+resultado);

	}

}
