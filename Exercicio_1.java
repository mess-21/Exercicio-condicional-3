package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_1 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		double n;
		System.out.println("Digite um n�mero");
		n = leitor.nextDouble();
		if(n >= 20 && n <= 90)
		{
		System.out.println("O n�mero digitado se compreende entre 20 e 90");
		}
		else
		{
		System.out.println("O n�mero digitado N�O se compreende entre 20 e 90");
		}
	}
}
