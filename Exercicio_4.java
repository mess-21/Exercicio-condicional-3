package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_4 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		double lado_a, lado_b, lado_c;
		System.out.println("Digite o valor do 1� lado do tri�ngulo");
		lado_a = leitor.nextDouble();
		System.out.println("Digite o valor do 2� lado do tri�ngulo");
		lado_b = leitor.nextDouble();
		System.out.println("Digite o valor do 3� lado do tri�ngulo");
		lado_c = leitor.nextDouble();
		
		//3 Lados Iguais
		if (lado_a == lado_b && lado_a == lado_c)
		{
			System.out.println("O tri�ngulo � EQUIL�TERO (Todos os lados iguais)");
		}
		//Todos Lados Diferentes
		else if ( (lado_a != lado_b) && (lado_a != lado_c) && (lado_c != lado_b))
		{
			System.out.println("O tri�ngulo � ESCALENO (Todos os lados diferentes)");	
		}
		//2 Lados Iguais
		else
		{
			System.out.println("O tri�ngulo � IS�CELES (2 lados iguais)");	
		}

		

	}
}
