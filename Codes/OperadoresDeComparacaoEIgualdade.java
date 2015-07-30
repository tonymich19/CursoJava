public class OperadoresDeComparacaoEIgualdade {

		public static void main(String [] args){
		 
		int a = 10;
		int b = 5;
		int c = 2;
		
		boolean maior = b > a; //false
		boolean maiorOuIgual = b >= a; //false
		boolean menor = a < b; //false
		boolean menorOuIgual = a <= 10; //true
		boolean igual = a == b - c; //false
		boolean diferente = a != c; //true
		
		System.out.println(maior);
		System.out.println(maiorOuIgual);
		System.out.println(menor);
		System.out.println(menorOuIgual);
		System.out.println(igual);
		System.out.println(diferente);

		}
		
}