public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double whitDrawLimit;

    public Account(Double balance, String holder, Integer number, Double whitDrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.whitDrawLimit = whitDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWhitDrawLimit() {
        return whitDrawLimit;
    }

    public void setWhitDrawLimit(Double whitDrawLimit) {
        this.whitDrawLimit = whitDrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }


    public void Withdraw(Double amount) {
        if(amount > whitDrawLimit){
       throw new  DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        else if (balance < amount && whitDrawLimit >= amount) {
            throw  new DomainException("Withdraw error: Not enough balance");
            
        }    
        else {
            balance -= amount;
        }

    }
    public String toString() {
        return "new balance: " + balance; 
    }
}
