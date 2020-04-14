package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " +nomeCompleto+".");
		
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " +primeiroNome+".");
		
		System.out.print("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " +idade+".");

		System.out.print("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " +altura);*/
		
		System.out.println("Digite os seu primeiro nome, idade, quantidades de filhos, altura e se tem bichinho de estimação: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean tempet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome é: " +primeiroNome+".");
		System.out.println("Idade: " +idade+".");
		System.out.println("Quantidades de filhos: " +qtdFilhos+".");
		System.out.println("Altura: " +altura+".");
		System.out.println("Tem bichinho de estimação? " +tempet+".");
		
	}

}
