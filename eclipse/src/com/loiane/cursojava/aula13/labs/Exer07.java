package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		/*7. Fa�a um programa que calcule a �rea de um quadrado, 
		em seguida mostre o dobro desta �rea para o usu�rio.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		//a= lado * lado
		double area = Math.pow(lado, 2);
		System.out.println("A area do quadrado �: "+area); 
		System.out.println("O dobro da area do quadrado �: "+ (area * 2)); 

	}

}
