package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		/*13. Faça umprograma que pergunte quanto você 
		 * ganha por hora e o número de horas trabalhadas no mês. 
		 * Calcule e mostre o totaldo seu salario no referido 
		 * mês, sabendo-se que são descontados 11% para o 
		 * Imposto de Renda, 8% para os INSS e 5% para o 
		 * sindicato, faça um programa que nos dê:
		 * a) salario bruto
		 * b) quanto pagou ao INSS
		 * c) quanto pagou ao sindicato
		 * d) o salarios liquido
		 * e) Calcule os descontos e o salario liquido, conforme a 
		 * tabela abaixo:
		 *  +salario bruto: R$ - IR (11%) : R$ - INSS (8%): R$ - SINDICATO (5%) : R$ = salario liquido :R$ obs:salario bruto - descontos = salario liquido*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
			
		System.out.println("O peso ideal é  : "+pesoIdeal); 

	}

}
