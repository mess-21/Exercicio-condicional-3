package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_5 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int matricula;
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a matr�cula do aluno");
		matricula = leitor.nextInt();
		
		System.out.println("Digite a 1� nota do aluno (Valor de 0 a 10)");
		n1 = leitor.nextDouble();		
		System.out.println("Digite a 2� nota do aluno (Valor de 0 a 10)");
		n2 = leitor.nextDouble();
		
		System.out.println("Digite a 3� nota do aluno (Valor de 0 a 10)");
		n3 = leitor.nextDouble();
		
		System.out.println("Digite a 4� nota do aluno (Valor de 0 a 10)");
		n4 = leitor.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		if(media > 10 || media < 0)
		{
		System.out.println("Valor de todas as nota devem estar entre 10 a 0");
		}
		else
		{	
			System.out.println("Matr�cula: "+matricula);
			System.out.println("M�dia: "+media);
		
			if (media >= 7) 
			{
				System.out.println("O aluno est� APROVADO");
			}
		
			else if(media > 7 && media >= 3.5) 
			{
				System.out.println("O aluno est� em RECUPERA��O");	
			}
		
			else if(media < 3.5) 
			{
				System.out.println("O aluno est� REPROVADO");	
			}
		}
		
	}
}
