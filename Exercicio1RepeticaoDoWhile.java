package exercicios;

public class Exercicio1RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 15; // inicializador
		double quadrado  ;
		
		//Processamento
		
		 do {
			
			quadrado = Math.pow(cont, 2);
			System.out.println(quadrado);//Saida
			cont ++; // incremento
			//cont =cont+1
			//cont +=1;
			
		 }while (cont<=200); 
			
		//Fim do While
	}

}
