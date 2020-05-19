package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_2 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade do nadador");
		idade = leitor.nextInt();
		
		
		if(idade < 5)
		{
			System.out.println("Idade muita baixa, impossível categorizar o nadador");
		}
		else if(idade >= 5 && idade <= 10)
		{
			System.out.println("O nadador pertence a categoria: INFANTIL");
		}
		else if(idade >= 11 && idade <= 17)
		{
			System.out.println("O nadador pertence a categoria: JUVENIL");	
		}
		else if(idade >= 18)
		{
			System.out.println("O nadador pertence a categoria: ADULTO");	
		}

	}
}
