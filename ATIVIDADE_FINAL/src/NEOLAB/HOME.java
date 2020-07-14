package NEOLAB;

import java.util.Scanner;

public class HOME {

		public static void main(String[] args) {
		    System.out.println(" SEJA BEM VINDO A NEOLAB ");
		    System.out.println(" POR FAVOR DIGITE SEU NOME ");
		    String nome;
			Scanner texto = new Scanner(System.in);
			nome = texto.nextLine();
			
		    System.out.println(" POR FAVOR DIGITE SEU NÚMERO DE TELEFONE ");
		    int numero;
			Scanner texto1 = new Scanner(System.in);
			numero = texto1.nextInt();
			
			System.out.println("A NEOLAB AGRADECE A PRESENÇA" + nome);
			System.out.println("CONTATO SALVO:" + numero);
		    
		    // ACESSAR A CLASE MENU//
			MENU objMenu = new MENU();
			// CHAMA O METODO Opcoes//
			objMenu.Opcoes();
			// CHAMA O METODO Escolha//
			objMenu.Escolha();

			texto.close(); 
			texto1.close(); 


	}


}
