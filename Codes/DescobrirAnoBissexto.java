import java.util.Scanner;

public class DescobrirAnoBissexto {

	public static void main(String[]args);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Ano: ");
		int ano = entrada.nextInt();
	
		if (ano % 400 == 0) {
			System.out.println ("O ano \"" + ano "\" + e um bissexto.");
		} else if (ano % 4 == 0) {
			if (ano % 100 != 0) {
				System.out.println("O ano \"" + ano "\" + e um bissexto.");
			} else {
				System.out.println("O ano \"" + ano "\" + nao e um bissexto.");
			}
		} else {
			System,out.println ("O ano \"" + ano "\" +  nao e um bissexto.");
			}
	
}