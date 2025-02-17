

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;



public class App {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
      
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato:");
		System.out.print("numero: ");
		int code = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();

		Contrato contrato = new Contrato(code, date, new ServicePaypal(), totalValue);
		System.out.print( "Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		System.out.println("PARCELAS");

		for(int i = 0; i<n; i++) {
			System.out.println(date.plusMonths(i+1) + " - " + contrato.getPayserv().parcelas(totalValue/n, i +1) );
             


      

		}



		 

	}
}