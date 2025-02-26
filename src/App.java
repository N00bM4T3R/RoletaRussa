

import java.io.File;
import java.text.ParseException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;



public class App {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		File arquivo = new File("C:\\Games\\teste");

	
		System.out.println("escolha as opções: pedra - 1, papel -2, tesoura - 3");
		int escolhaUsuario = sc.nextInt();

		int escolhaComputador = rd.nextInt(3) + 1;


		  switch (escolhaComputador) {
			  case 1:
				  System.out.println("escolha do computador: Pedra");
				  break;
				  case 2 :
				  System.out.println("escolha do computador: papel");
				  break;
				  case 3:
				  System.out.println("escolha do computador: tesoura");
				  break;
			  default:
				  
		  }

		  

		if ( escolhaUsuario ==  escolhaComputador) {
			System.out.println("empate");
		}

		else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
		(escolhaUsuario == 2 && escolhaComputador == 1) ||
		(escolhaUsuario == 3 && escolhaComputador == 2)) {
               System.out.println("Você venceu!");
			
		}
		else {
			System.out.println("computador vençeu");
			
         if (arquivo.exists()) {
			System.out.println("arquivo encontrado");
			if (arquivo.delete()) {
				System.out.println("arquivo deletado com sucesso");
			}
			else {
				System.out.println("arquivo não foi deletado ");
			}
		 }
		 else {
			System.out.println("arquivo não encontrado");
		 }
			
		}




		
      
		
		


      

		}



		 

	}
