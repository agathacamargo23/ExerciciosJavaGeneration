package br.com.aulajava.pratica;

import java.util.Scanner;

public class IdadeExpressaEmMesesDiasAnos {
	
		public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);		

		
     int dias, meses, anos;
     
     System.out.println("Informe a sua idade: ");
     dias = leia.nextInt();
    
     anos = dias / 365;
     meses = (dias % 365) / 30;
     dias = (dias % 365) % 30;
     
     
     System.out.println("Sua idade em anos é de " + anos + "anos, " + meses + " meses, e " + dias + " dias");
     
     
     
     
     
     
	
	

	}

}
