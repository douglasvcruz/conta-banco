package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o numero da Agência!");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, digite a Agência");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o Nome");
		String cliente = scanner.next();
		
		System.out.println("Por favor, digite o Saldo");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
	}
}
