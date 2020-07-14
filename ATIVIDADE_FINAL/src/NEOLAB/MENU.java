package NEOLAB;

import java.util.Scanner;


public class MENU {
	int escolha=0;
	int loopM = 0;
	Scanner objScanner = null;

	public void Opcoes() { 
		
		
        System.out.println(" DIGITE 1 PARA ACESSAR OS PRODUTOS: ");
        System.out.println(" DIGITE 2 PARA ACESSAR OS SERVIÇOS: ");
        System.out.println(" DIGITE 3 PARA ENCERRAR: ");

        
    }
	
	public void Escolha() {
		
    	objScanner = new Scanner(System.in);
    	escolha = objScanner.nextInt();
	
		
		if(escolha==1)
		{
		    System.out.println(" VOCÊ ACESSOU OS PRODUTOS DA NEOLAB ");
			PRODUTOS objProdutosinfo = new PRODUTOS();
			objProdutosinfo.Produtos();
	

		}
		
		if(escolha==2)
		{
		    System.out.println(" VOCÊ ACESSOU OS SERVIÇOS DA NEOLAB ");
		    SERVICOS objServicosinfo = new SERVICOS();
		    objServicosinfo.Servicos();		    		

		}
		
		if(escolha==3)
		{
		    System.out.println(" ENCERRADO ");

		}
		else if(escolha>=4)
		{
		    System.out.println(" VALOR INVALIDO ");

		}
///
		
	}
}
