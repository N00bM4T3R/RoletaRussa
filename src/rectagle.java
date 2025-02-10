public class rectagle  extends shape{

    private double widh;
    private double heigth;

    public rectagle(double heigth, double widh, color color) {
        super(color);
        this.heigth = heigth;
        this.widh = widh;
    }

    @Override
    public double area() {
       return  widh * heigth;
    }

    
    
}
