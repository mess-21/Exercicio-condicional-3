package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_1 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		double n;
		System.out.println("Digite um número");
		n = leitor.nextDouble();
		if(n >= 20 && n <= 90)
		{
		System.out.println("O número digitado se compreende entre 20 e 90");
		}
		else
		{
		System.out.println("O número digitado NÃO se compreende entre 20 e 90");
		}
	}
}
