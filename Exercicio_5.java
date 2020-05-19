package exercicio_de_condicional_3;

import java.util.Scanner;

public class Exercicio_5 
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		int matricula;
		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a matrícula do aluno");
		matricula = leitor.nextInt();
		
		System.out.println("Digite a 1ª nota do aluno (Valor de 0 a 10)");
		n1 = leitor.nextDouble();		
		System.out.println("Digite a 2ª nota do aluno (Valor de 0 a 10)");
		n2 = leitor.nextDouble();
		
		System.out.println("Digite a 3ª nota do aluno (Valor de 0 a 10)");
		n3 = leitor.nextDouble();
		
		System.out.println("Digite a 4ª nota do aluno (Valor de 0 a 10)");
		n4 = leitor.nextDouble();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		if(media > 10 || media < 0)
		{
		System.out.println("Valor de todas as nota devem estar entre 10 a 0");
		}
		else
		{	
			System.out.println("Matrícula: "+matricula);
			System.out.println("Média: "+media);
		
			if (media >= 7) 
			{
				System.out.println("O aluno está APROVADO");
			}
		
			else if(media > 7 && media >= 3.5) 
			{
				System.out.println("O aluno está em RECUPERAÇÃO");	
			}
		
			else if(media < 3.5) 
			{
				System.out.println("O aluno está REPROVADO");	
			}
		}
		
	}
}
