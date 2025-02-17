public class ServicePaypal  implements PaymentService{

  private static Double valorMes = 0.01;
  private static Double valorporMes = 0.02;

    @Override
    public Double parcelas(Double amount, int mes ) {
       
        return calculoPorMes(amount, mes) ;
        
    }
    public Double calculoMes(Double amount, int mes) {

      return  amount = amount + (amount * valorMes) * mes;
    }
    public Double calculoPorMes(Double amount, int mes) {
        return  calculoMes(amount, mes) + calculoMes(amount, mes) * valorporMes ;
    }
}
 
    

