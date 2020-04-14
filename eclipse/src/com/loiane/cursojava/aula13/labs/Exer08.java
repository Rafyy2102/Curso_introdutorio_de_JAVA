package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		/*8. Faça um programa que pergunte quanto você ganha por hora e o 
		número de horas trabalhadas no mês. Calcule e mostre o total do 
		seu salário ne referido mês.*/
		
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Entre com a quantidade de horas trabalhadas no mês");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		System.out.println("O salario é de: "+ salario);
	}

}
