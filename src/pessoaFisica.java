public final class pessoaFisica extends  pessoa {
    
    private Double gastoSaude;
    

    public pessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }
    public Double getGastoSaude() {
        return gastoSaude;
    }


    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    


    @Override
    public double  imposto() {
       if (RendaAnual >= 20000 && gastoSaude != 0) {
          
        return  (RendaAnual * 0.25) - (gastoSaude * 0.5);

       }
       else if (RendaAnual <= 20000 && gastoSaude != 0) {

        return  (RendaAnual * 0.15) - (gastoSaude * 0.5);
       }
           else if (RendaAnual >= 20000 && gastoSaude == 0 ) {
            return  (RendaAnual * 0.25);
           }
               else {
                return  (RendaAnual * 0.15);

               }
    }


   

    

}
