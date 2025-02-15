

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



public class App {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
      
		String strPath = "C:\\Games\\program\\produtos.txt";

	   File file = new File(strPath);
	   String StrParente = file.getParent();

	   List<Product> listpd = new ArrayList<>();

	  
	  

	   try(BufferedReader br = new BufferedReader(new FileReader(file))) {

		    String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);

				listpd.add(new Product(name, price, quantity));
				line = br.readLine();

			}
	  
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		boolean success = new File(StrParente + "\\out").mkdir();
		String path2 = StrParente + "\\out" + "\\Sumarry.txt";




		try(BufferedWriter bw = new BufferedWriter( new FileWriter(path2))) {


                
			for (Product list : listpd) {
				bw.write(list.getName() + ", " + list.totalPrice());
				bw.newLine();
                


			}


		} catch(IOException e) {
			System.out.println(e.getMessage());
		}






		
		
		



	}
}