package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		/*2. Faça um programa que peça um número e então mostre a mensagem 
		'O número informado foi:[número]'.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi: " + numero);
	}

}
