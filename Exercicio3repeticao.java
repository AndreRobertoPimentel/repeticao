package exercicios;

import javax.swing.JOptionPane;

public class Exercicio3repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 1; // inicializador
		int soma = 0 ;
		
		//Processamento
		
		while (cont<=100) {
			
			soma=cont+soma;
			cont ++; // incremento
			
			System.out.println(soma);//Saida
			
		} //Fim do While
		
		JOptionPane.showMessageDialog(null, "Soma = "+ soma);//saida final
	}

}
