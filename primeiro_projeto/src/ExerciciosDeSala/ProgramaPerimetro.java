package ExerciciosDeSala;
import java.util.Locale;
import java.util.Scanner;
public class ProgramaPerimetro {
	public static void main(String[] args) {
		// criação e definição do novo Locale padrão
		final var localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		
		final double RAIO;
		try(Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite o raio: ");
			RAIO = entrada.nextDouble();
		}
		System.out.format("Perímetro = %.2f%n", 2*Math.PI*RAIO);
	}
}

