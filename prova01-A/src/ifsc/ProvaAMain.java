package ifsc;

import java.util.Scanner;

public class ProvaAMain {

	public static float media(float numero[], int b) {
		int i;
		float total = 0;
		for (i = 0; i < b; i++) {
			total = total + numero[i];
		}
		total = total / b;
		return total;
	}

	public static void main(String[] args) {
		int i, d, c;
		float total;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite quantos numeros tera o vetor");
		d = leitor.nextInt();
		System.out.println("Digite " + d + " numeros reais positivos");
		float[] numero = new float[d];
		for (i = 0; i < d; i++) {
			numero[i] = leitor.nextFloat();
			while (numero[i] <= 0.0) {
				System.out.println("Digite outro valor para o número, este foi inválido");
				numero[i] = leitor.nextFloat();
			}
		}
		total = media(numero, d);
		System.out.println("A média foi de " + total);
		leitor.close();

	}

}
