
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        List <product> pd = new ArrayList<>();

        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

    for (int i = 0; i<n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char code = sc.next().charAt(0);
            System.out.print("name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("price: ");
            Double price = sc.nextDouble();
            switch (code) {
                case 'i' :
                System.out.print("Customs fee: ");
                Double fret = sc.nextDouble();

                pd.add(new productImported(name, price, fret));
                     
                    break;
                case 'u' :
                  System.out.print("Manufacture date (DD/MM/YYYY):");
                  LocalDate manufatureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                  pd.add(new usedProduct(name, price, manufatureDate));
                 break;

                default:
                  pd.add(new product(name, price));

                   
            }
    }
    System.out.println("");
    System.out.println("PRICE TAGS:");
    for(product c : pd) {
        System.out.println(c.priceTag());
    }            

    }
}
