import java.util.Scanner;

public class IMC{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.print(nome + "," + "o seu indice de massa corporal e: " + imc + ".");
	
	}


}