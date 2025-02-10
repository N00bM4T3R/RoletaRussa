
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         Locale.setDefault(Locale.US);
         List<pessoa> list = new ArrayList<>();
     
System.out.print("Enter the number of tax payers: ");
int n = sc.nextInt();
 for (int i = 0; i<n ; i++) {
   System.out.println("Tax payer #"+(i+1)+" data:");
  System.out.print("Individual or company (i/c)?");
  char code = sc.next().charAt(0);
  System.out.print("Name: ");
  sc.nextLine();
  String nome = sc.nextLine();
  System.out.print("Anual income: ");
  Double RendaAnual = sc.nextDouble();

  switch (code) {
      case 'i':
           System.out.print("Health expenditures: ");
           Double gastoSaude = sc.nextDouble();
           list.add(new pessoaFisica(nome, RendaAnual, gastoSaude));
          break;
      default:
      System.out.print("Number of employees:");
      int Nfuncionarios = sc.nextInt();
      list.add(new pessoaJuridica(nome, RendaAnual, Nfuncionarios));


    
  }

 }     
 System.out.println("TAXES PAID:");
 double sum = 0.0;
 for (pessoa c : list) {
    System.out.println(c.getNome() + "$ - " + String.format("%.2f", c.imposto()));

    sum+= c.imposto();
     
 }
 System.out.print("TOTAL TAXES:");
 System.out.println(String.format("%.2f", sum));
 

}


    }

