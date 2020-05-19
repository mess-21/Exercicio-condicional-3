package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_3 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		double salario;
		System.out.println("Digite o salário atual do funcionário");
		salario = leitor.nextDouble();
		
		
		if(salario < 0)
		{
			System.out.println("Erro ao calcular o aumento do salário");	
		}
		else if(salario >= 0 && salario <= 1000)
		{
			System.out.println("Percentual de aumento : 15%");
			System.out.println("O novo salário é : "+ ( salario+ ( (salario*15)/100 ) ) );
		}
		else if(salario >= 1000.01 && salario <= 2500)
		{
			System.out.println("Percentual de aumento : 7%");
			System.out.println("O novo salário é : "+ ( salario+ ( (salario*7)/100 ) ) );
		}
		else if(salario > 2500)
		{
			System.out.println("Não há aumento para esta faixa de salário");
		}


	}
}
