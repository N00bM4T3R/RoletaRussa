
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
         
      List<shape> list = new ArrayList<>();

       System.out.print("Enter the number of shapes:");
       int n = sc.nextInt();        

       for (int i = 0; i < n; i++) {
    System.out.println("Shape #"+(i+1)+ "data:");
    System.out.print("Rectangle or Circle (r/c)?");
    char code = sc.next().charAt(0);
    System.out.print("Color (BLACK/BLUE/RED):");
    sc.nextLine();
  color colo = color.valueOf(sc.next());

    switch (code) {
        case 'r':
        System.out.print("widh: ");
        Double widh = sc.nextDouble();
        System.out.print("heigth: ");
        Double heigth = sc.nextDouble();
        list.add(new rectagle(widh, heigth, colo ));
            
            break;
        default:
        System.out.println("radio: ");
        Double radio = sc.nextDouble();
        list.add(new circle(radio, colo));
          
    }
   
    }
    System.out.print("SHAPE AREAS:");
    for (shape c : list) {
        System.out.println(String.format("%.2f", c.area()));
       }

    }
}
