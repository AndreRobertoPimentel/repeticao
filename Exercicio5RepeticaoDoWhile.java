package exercicios;

public class Exercicio5RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int resultado= 0;
		
		// processamento
		System.out.println("Numeros impares ");
		do {
			
			resultado = cont % 2;
			if (resultado == 1)
			System.out.println(cont);
			cont++;
		}while (cont<=20);
	}

}
