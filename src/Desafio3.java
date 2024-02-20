import java.util.Scanner;

public class Desafio3 {

	/*
	 * 3) Desafio da estrutura while Escreva um programa que solicita números
	 * inteiros ao usuário de forma contínua e soma todos os números informados.
	 * 
	 * O programa deve parar de solicitar mais números e imprimir a soma deles na
	 * saída apenas quando o valor total somado for igual ou superior a 100.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int somaNumeros = 0;

		while (somaNumeros < 100) { // enquanto a 'somaNumeros' for menor que 100
			System.out.print("Digite um número: ");
			int numero = entrada.nextInt();

			somaNumeros += numero; // Vai somar 'somaNumeros + numero'
		}

		System.out.printf("Soma dos números: %d%n", somaNumeros);
	}

}
