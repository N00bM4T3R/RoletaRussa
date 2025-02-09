public class productImported  extends  product {


    protected Double fret;

    public productImported(String name, Double price, Double fret) {
        super(name, price);
        this.fret = fret;
    }

    public Double getFret() {
        return fret;
    }

    public void setFret(Double fret) {
        this.fret = fret;
    }

    @Override
    public String priceTag() {
        return name + " " + totalPrice()+ "(Custo free :" + fret + " )";
    }

    public Double totalPrice() {
        return price + fret;
    }

    


    
    
}
