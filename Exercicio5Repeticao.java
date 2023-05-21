package exercicios;

public class Exercicio5Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar entradas
		
		int cont = 0;
		int resultado= 0;
		
		// processamento
		System.out.println("Numeros impares ");
		while (cont<=20) {
			
			resultado = cont % 2;
			if (resultado == 1)
			System.out.println(cont);
			cont++;
		}
		
	}

}
