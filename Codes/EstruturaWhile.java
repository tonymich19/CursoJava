import java.util.Scanner;

public class EstruturaWhile{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero Inicial: ");
		int numeroInicial = entrada.nextInt();
		
		System.out.print("Numero final: ");
		int numeroFinal = entrada.nextInt();
		
		int numeroAtual = numeroInicial ;
		
		while (numeroAtual <= numeroFinal) {
			System.out.print( numeroAtual + " ,");
			numeroAtual++;
		}
	
	}
	
}