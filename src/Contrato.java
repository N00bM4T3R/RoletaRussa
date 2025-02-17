
import java.time.LocalDate;


public class Contrato {

private int code;
private LocalDate date;
private Double totalValue;
private PaymentService payserv;
private int n ;



    public Contrato(int code, LocalDate date, PaymentService payserv, Double totalValue) {
        this.code = code;
        this.date = date;
        this.payserv = payserv;
        this.totalValue = totalValue;
    }

    public Contrato(int code, LocalDate date, int n, PaymentService payserv, Double totalValue) {
        this.code = code;
        this.date = date;
        this.n = n;
        this.payserv = payserv;
        this.totalValue = totalValue;
    }

   


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public PaymentService getPayserv() {
        return payserv;
    }

    public void setPayserv(PaymentService payserv) {
        this.payserv = payserv;
    }

  



    





}


