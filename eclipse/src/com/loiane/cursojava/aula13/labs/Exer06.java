package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		//6. Fa�a um progama que pe�a o raio de um circulo, calcule e mostre sua �rea.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o raio do c�rculo: ");
		double raio = scan.nextDouble();
		
		//area = pi * raio�2
		double area = Math.PI * Math.pow(raio, 2);
		System.out.print("A area do circulo �: "+ area);
	}

}
