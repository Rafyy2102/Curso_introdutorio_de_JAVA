package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		/*13. Fa�a umprograma que pergunte quanto voc� 
		 * ganha por hora e o n�mero de horas trabalhadas no m�s. 
		 * Calcule e mostre o totaldo seu salario no referido 
		 * m�s, sabendo-se que s�o descontados 11% para o 
		 * Imposto de Renda, 8% para os INSS e 5% para o 
		 * sindicato, fa�a um programa que nos d�:
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
			
		System.out.println("O peso ideal �  : "+pesoIdeal); 

	}

}
