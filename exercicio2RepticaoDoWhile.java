package exercicios;

import javax.swing.JOptionPane;

public class exercicio2RepticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0; // inicializador
		int tabuada = 0;
		int resultado =0;
		//Processamento
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero ")) ;
		
		do {
			
			resultado = tabuada * cont;
			System.out.println( tabuada + "x" + cont + "=" + resultado);//Saida
			JOptionPane.showMessageDialog(null, "Resultado  = "+ resultado );//saida final
			cont ++; // incremento
			
			
			
		}while (cont<=10); //Fim do While
	}

}
