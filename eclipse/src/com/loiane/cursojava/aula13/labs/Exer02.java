package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		/*2. Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem 
		'O n�mero informado foi:[n�mero]'.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero inteiro: ");
		int numero = scan.nextInt();
		System.out.println("O numero informado foi: " + numero);
	}

}
