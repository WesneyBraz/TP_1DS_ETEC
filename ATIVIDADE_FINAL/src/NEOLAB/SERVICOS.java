package NEOLAB;
 
import java.util.Scanner;

public class SERVICOS {
	
	Scanner objScanner = null;
	//SELEÇÃO
	int servicos = 0;
	
	//LINHA LABORATORIAL
	int servicosL = 0;
	int loop1 = 1; 
	
	//LINHA HOSPITALAR 
	int servicosH = 0;
	int loop2 = 1;
	
	
	public void Servicos () {
		
		System.out.println("DESEJA VER OS SERVIÇOS DA LINHA LABORATORIAL OU HOSPITALAR DA NEOLAB ?");
		System.out.println(" DIGITE 1 PARA LINHA LABORATORIAL");
		System.out.println(" DIGITE 2 PARA LINHA HOSPITALAR");
		
    	objScanner = new Scanner(System.in);
    	servicos = objScanner.nextInt();
    	
    	if(servicos==1)
    	{   
    		while(loop1==1)
    		{
				System.out.println("VOCÊ ACESSOU A LISTA DE SERVIÇOS DA LINHA LABORATORIAL");
				System.out.println("DIGITE O NÚMERO DO SERVIÇO QUE DESEJA ADQUIRIR:");
				System.out.println("Nº1 - INTERFACEAMENTO COMPLETO DO LABORATORIO");
				System.out.println("Nº2 - INTERFACEAMENTO PARCIAL DO LABORATORIO");
				System.out.println("Nº3 - MANUTENÇÃO E SUPORTE DE EQUIPAMENTOS E SISTEMAS LABORATORIAIS");			
				servicosL = objScanner.nextInt();
	
				switch(servicosL)
				{	
					case 1:
					System.out.println("PARABÉNS VOCÊ ADQUIRIU UM SERVIÇO DE INTERFACEAMENTO COMPLETO PARA SEU LABORATORIO");		
					System.out.println("NOSSO SETOR COMERCIAL VAI ENTRAR EM CONTATO");				
					break;
	    	
			    	case 2:
						System.out.println("PARABÉNS VOCÊ ADQUIRIU UM SERVIÇO DE INTERFACEAMENTO PARCIAL PARA SEU LABORATORIO");		
						System.out.println("NOSSO SETOR COMERCIAL VAI ENTRAR EM CONTATO");	
			    	break;
			    	
			    	case 3:
						System.out.println("PARABÉNS VOCÊ ADQUIRIU UM SERVIÇO DE MANUTENÇÃO E SUPORTE DE EQUIPAMENTOS E SISTEMAS LABORATORIAIS ");		
						System.out.println("NOSSO SETOR COMERCIAL VAI ENTRAR EM CONTATO");	
			    	break;
			    }
			
			System.out.println("DESEJA REALIZAR UM NOVO PEDIDO DA LINHA LABORATORIAL ?");
			System.out.println("DIGITE 1 PARA CONTINUAR NA LISTA DE PRODUTOS LABORATORIAL OU QUALQUER NÚMERO PARA ENCERRAR O PEDIDO");
	    	loop1 = objScanner.nextInt();	
			}

    	}
    	
    	if(servicos==2)
    	{   
    		while(loop2==1)
    		{
				System.out.println("VOCÊ ACESSOU A LISTA DE SERVIÇOS DA LINHA HOSPITALAR");
				System.out.println("DIGITE O NÚMERO DO SERVIÇO QUE DESEJA ADQUIRIR:");
				System.out.println("Nº1 - INTERFACEAMENTO COMPLETO DO HOSPITAL");
				System.out.println("Nº2 - INTERFACEAMENTO PARCIAL DO HOSPITAL");
				System.out.println("Nº3 - MANUTENÇÃO E SUPORTE DE EQUIPAMENTOS E SISTEMAS HOSPITALAR");			
				servicosL = objScanner.nextInt();
	
				switch(servicosH)
				{	
					case 1:
					System.out.println("PARABÉNS VOCÊ ADQUIRIU UM SERVIÇO DE INTERFACEAMENTO COMPLETO PARA SEU HOSPITAL");		
					System.out.println("NOSSO SETOR COMERCIAL VAI ENTRAR EM CONTATO");				
					break;
	    	
			    	case 2:
						System.out.println("PARABÉNS VOCÊ ADQUIRIU UM SERVIÇO DE INTERFACEAMENTO PARCIAL PARA SEU HOSPITAL");		
						System.out.println("NOSSO SETOR COMERCIAL VAI ENTRAR EM CONTATO");	
			    	break;
			    	
			    	case 3:
						System.out.println("PARABÉNS VOCÊ ADQUIRIU UM SERVIÇO DE MANUTENÇÃO E SUPORTE DE EQUIPAMENTOS E SISTEMAS HOSPITALARES ");		
						System.out.println("NOSSO SETOR COMERCIAL VAI ENTRAR EM CONTATO");	
			    	break;
			    }
			
			System.out.println("DESEJA REALIZAR UM NOVO PEDIDO DA LINHA HOSPITAL ?");
			System.out.println("DIGITE 1 PARA CONTINUAR NA LISTA DE PRODUTOS HOSPITALAR OU QUALQUER NÚMERO PARA ENCERRAR O PEDIDO");
	    	loop2 = objScanner.nextInt();	
			}
    		
    	}
    	
		if(servicosL>=1 && servicosL>=1)
		{
			System.out.println("SEU PEDIDO FOI REALIZADO COM SUCESSO, OBRIGADO E VOLTE SEMPRE ");

		}
		System.out.println("FIM DO PROGRAMA ");
	}

}
