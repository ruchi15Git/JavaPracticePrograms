package Exceptions.HandlingException;

public class CustomException_ex2 {
    public static void main(String[] args){
        Bank sbi=new Bank("INR",200);
        Bank icici=new Bank("INR",400);
        Bank jp_chase= new Bank("USD",500);
        int res= jp_chase.addAmmount();
        System.out.println(res);

    }
}
class Bank{
    private String currency;
    private int amount;
     Bank (String currency, int amount){
         this.currency=currency;
         this.amount=amount;
     }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public int setAmount(int amount) {
        return this.amount = amount;
    }

    public int addAmmount(){
         if(currency.equalsIgnoreCase("INR")){
             return this.amount+setAmount(2);
         }
         else{
             throw new IllegalArgumentException("The currency must be INR..");
         }
    }
}