import java.util.Scanner;

public class ExameCortisol {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Cortisol: ");
		double cortisol = entrada.nextDouble();

		// cortisol ideal é de 6 a 18.4
		boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4; // Todas as condições precisam ser verdadeiras
		System.out.printf("Cortisol normal: %b%n", resultadoNormal);

		boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4; // Apenas uma condição precisa ser verdadeira
		System.out.printf("C ortisol anormal: %b%n", resultadoAnormal);
	} 

}
