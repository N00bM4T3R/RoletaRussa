

public  class  circle extends  shape {

    private Double radio;

    public circle(Double radio, color color) {
        super(color);
        this.radio = radio;
    }



   @Override
   public double area() {
    return  (radio * radio) * Math.PI;
   }

public String toString() {
    
}


}

