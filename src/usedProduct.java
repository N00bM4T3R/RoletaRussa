import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class  usedProduct extends  product {


    protected LocalDate manufatureDate ;

   

    public usedProduct(String name, Double price, LocalDate manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    public LocalDate getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(LocalDate manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

     @Override
    public String priceTag() {;
        return name +"(used)"+ " " + price + "(Manufacture date: " + manufatureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +" )";
    }

}