package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		/*8. Fa�a um programa que pergunte quanto voc� ganha por hora e o 
		n�mero de horas trabalhadas no m�s. Calcule e mostre o total do 
		seu sal�rio ne referido m�s.*/
		
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhadas no m�s");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		System.out.println("O salario � de: "+ salario);
	}

}
