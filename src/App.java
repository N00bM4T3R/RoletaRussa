
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);
      try {

         System.out.println("Enter account data");
         System.out.print("Number: ");
          int number = sc.nextInt();
          System.out.print("Holder: ");
          sc.nextLine();
          String holder = sc.nextLine();
          System.out.print("Initial balance: ");
          Double balance = sc.nextDouble();
          System.out.print("Withdraw limit: ");
          Double whitDrawLimit = sc.nextDouble();

          Account acc = new Account(balance, holder, number, whitDrawLimit);
          System.out.print("Enter amount for withdraw:");
          Double amount = sc.nextDouble();
          acc.Withdraw(amount);
          System.out.println(acc.toString());
         
      }

      catch(DomainException e) {
         System.out.println("Withdraw error: The amount exceeds withdraw limit");
      }
      catch(RuntimeException e ) {
         System.out.println("Unexplicable erro");
      }

      }
      }

      
    

