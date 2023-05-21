package exercicios;

import javax.swing.JOptionPane;

public class Exercicio2Repeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0; // inicializador
		int tabuada = 0;
		int resultado =0;
		//Processamento
		
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero ")) ;
		
		while (cont<=10) {
			
			resultado = tabuada * cont;
			System.out.println( tabuada + "x" + cont + "=" + resultado);//Saida
			JOptionPane.showMessageDialog(null, "Resultado  = "+ resultado );//saida final
			cont ++; // incremento
			
			
			
		} //Fim do While
		
	}	

}
