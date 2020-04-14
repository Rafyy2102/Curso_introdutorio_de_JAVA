package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		//6. Faça um progama que peça o raio de um circulo, calcule e mostre sua área.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o raio do círculo: ");
		double raio = scan.nextDouble();
		
		//area = pi * raioª2
		double area = Math.PI * Math.pow(raio, 2);
		System.out.print("A area do circulo é: "+ area);
	}

}
