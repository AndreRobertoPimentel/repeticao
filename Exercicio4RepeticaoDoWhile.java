package exercicios;

import javax.swing.JOptionPane;

public class Exercicio4RepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 1; // inicializador
		int resultado ;
		int soma = 0;
		//Processamento
		
		do {
			resultado= cont %2;
			if (resultado  == 0) {
				soma = soma+cont;
				System.out.println(soma);//Saida
			}
			cont ++; // incremento
			
			
				
		}while (cont<=500); //Fim do While
		//System.out.println(soma);//Saida
		JOptionPane.showMessageDialog(null, "Soma = "+ soma);//saida final
	}

}
