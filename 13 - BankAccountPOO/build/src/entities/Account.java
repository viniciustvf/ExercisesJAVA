package entities;

public class Account {
    
    private Integer number;
    private String name;
    private Double balance = 0.0;
    private final Double withDrawLimit;
    
    public Account(int number, String name, Double initialDeposit, Double withDrawLimit){
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
        this.withDrawLimit = withDrawLimit;
    }
    public Account(Integer number, String name, Double withDrawLimit){
        this.number = number;
        this.name = name;
        this.withDrawLimit = withDrawLimit;
    }
    public Integer getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public double getWithDrawLimit() {
        return withDrawLimit;
    }
    public void deposit (Double value){
        balance += value;
    }
    public void withdraw (Double value){
        validateWithdraw(value);
        balance = getBalance() - value;
    }
    private void validateWithdraw(Double value){
        if(value >= getWithDrawLimit() && value <= getBalance()){
            throw new IllegalArgumentException("Saque excede o limite.");
        }if(value <= getWithDrawLimit() && value >= getBalance()){
            throw new IllegalArgumentException("Saque excede o saldo.");
        }
    }
    @Override
    public String toString(){
        return "Account: "
               + number
               + ", Holder: "
               + name
               + ", Balance: $"
               + String.format("%.2f", balance);
    }
    
}
