package NEOLAB;

import java.util.Scanner;

public class PRODUTOS {
	Scanner objScanner = null;
	//SELEÇÃO 
	int produtos,equipamento = 0;
	int loop = 1;
	
	//LINHA LABORATORIAL
	int quantidadeL, quantidadeHF, quantidadeCF, quantidadeAF, quantidadeT, quantidadeH, quantidadeC, quantidadeA  = 0;
	int loop1 = 1;
	
	//LINHA HOSPITALAR
	int quantidadeHO, quantidadeMF, quantidadeOF, quantidadeEF, quantidadeHT, quantidadeM, quantidadeO, quantidadeE  = 0;
	int loop2 = 1;
	
	


	public void Produtos (){
		while(loop==1)
		{
		System.out.println(" DESEJA VER OS PRODUTOS DA LINHA LABORATORIAL OU HOSPITALAR DA NEOLAB ?");
		System.out.println(" DIGITE 1 PARA LINHA LABORATORIAL");
		System.out.println(" DIGITE 2 PARA LINHA HOSPITALAR");

		
    	objScanner = new Scanner(System.in);
    	produtos = objScanner.nextInt();
	
		if(produtos==1)
		{	
			while(loop1==1)
			{
				System.out.println("VOCÊ ACESSOU A LISTA DE EQUIPAMENTOS DA LINHA LABORATORIAL");
				System.out.println("DIGITE O NÚMERO DO EQUIPAMENTO QUE DESEJA ADQUIRIR:");
				System.out.println("Nº1 - HEMOGRAMA:");
				System.out.println("Nº2 - CENTRIFUGA:");
				System.out.println("Nº3 - ANALISADOR:");			
				equipamento = objScanner.nextInt();

				switch(equipamento)
				{	
					case 1:
					System.out.println("DIGITE A QUANTIDADE DE HEMOGRAMA QUE DESEJA ADQUIRIR ");
					quantidadeH = objScanner.nextInt();
					quantidadeL = quantidadeH + quantidadeL;	
					quantidadeHF = quantidadeHF + quantidadeH;				
					break;
	    	
			    	case 2:
					System.out.println("DIGITE A QUANTIDADE DE CENTRIFUGA QUE DESEJA ADQUIRIR ");
			    	quantidadeC = objScanner.nextInt();	
			    	quantidadeL = quantidadeC + quantidadeL;	
					quantidadeCF = quantidadeCF + quantidadeC;
			    	break;
			    	
			    	case 3:
					System.out.println("DIGITE A QUANTIDADE DE ANALISADOR QUE DESEJA ADQUIRIR ");
			    	quantidadeA = objScanner.nextInt();	
			    	quantidadeL = quantidadeA + quantidadeL;
					quantidadeAF = quantidadeAF + quantidadeA;
			    	break;
			    }
			System.out.println("A QUANTIDADE TOTAL DE EQUIPAMENTOS ADQUIRIDO É DE:" + quantidadeL);
			System.out.println("LISTA DESCRITIVA" );
			System.out.println("HEMOGRAMA: "  + quantidadeHF );
			System.out.println("CENTRIFUGA: " + quantidadeCF );
			System.out.println("ANALISADOR: " + quantidadeAF );
			
			System.out.println("DESEJA REALIZAR UM NOVO PEDIDO DA LINHA LABORATORIAL ?");
			System.out.println("DIGITE 1 PARA CONTINUAR NA LISTA DE PRODUTOS LABORATORIAL OU QUALQUER NÚMERO PARA ENCERRAR O PEDIDO");
	    	loop1 = objScanner.nextInt();	
			}
		}
		
		if(produtos==2)
		{
						
			while(loop2==1)
			{
				System.out.println("VOCÊ ACESSOU OS PRODUTOS DA LINHA HOSPITALAR");
				System.out.println("DIGITE O NÚMERO DO EQUIPAMENTO QUE DESEJA ADQUIRIR:");
				System.out.println("Nº1 - MONITOR:");
				System.out.println("Nº2 - OXIMETRO:");
				System.out.println("Nº3 - ECG:");			
				equipamento = objScanner.nextInt();

				switch(equipamento)
				{	
					case 1:
					System.out.println("DIGITE A QUANTIDADE DE MONITOR QUE DESEJA ADQUIRIR ");
					quantidadeM = objScanner.nextInt();
					quantidadeHO = quantidadeM + quantidadeHO;	
					quantidadeMF = quantidadeMF + quantidadeM;				
					break;
	    	
			    	case 2:
					System.out.println("DIGITE A QUANTIDADE DE OXIMETRO QUE DESEJA ADQUIRIR ");
			    	quantidadeO = objScanner.nextInt();	
			    	quantidadeHO = quantidadeO + quantidadeHO;	
					quantidadeOF = quantidadeOF + quantidadeO;
			    	break;
			    	
			    	case 3:
					System.out.println("DIGITE A QUANTIDADE DE ECG QUE DESEJA ADQUIRIR ");
			    	quantidadeE = objScanner.nextInt();	
			    	quantidadeHO = quantidadeE + quantidadeHO;
					quantidadeEF = quantidadeEF + quantidadeE;
			    	break;
			    }
			System.out.println("A QUANTIDADE TOTAL DE EQUIPAMENTOS ADQUIRIDO É DE:" + quantidadeHO);
			System.out.println("LISTA DESCRITIVA" );
			System.out.println("MONITOR: "  + quantidadeMF );
			System.out.println("OXIMETRO: " + quantidadeOF );
			System.out.println("ECG: " + quantidadeEF );
			
			System.out.println("DESEJA REALIZAR UM NOVO PEDIDO DA LINHA HOSPITALAR ?");
			System.out.println("DIGITE 1 PARA CONTINUAR NA LISTA DE PRODUTOS HOSPITALAR OU QUALQUER NÚMERO PARA ENCERRAR O PEDIDO");
	    	loop2 = objScanner.nextInt();	

			}
			
		}
	
		System.out.println("DESEJA REALIZAR UM NOVO PEDIDO ?");
		System.out.println("DIGITE 1 CASO QUEIRA REALIZAR UM NOVO PEDIDO OU QUALQUER NÚMERO PARA ENCERRAR");
    	loop = objScanner.nextInt();	
		}
		if(quantidadeHO>=1 || quantidadeL>=1)
		{
			System.out.println("SEU PEDIDO FOI REALIZADO COM SUCESSO, OBRIGADO E VOLTE SEMPRE ");

		}
		System.out.println("FIM DO PROGRAMA ");

	}
	

}
