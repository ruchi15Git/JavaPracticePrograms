package OOPs.Encapsulation;

public class HDFCBank {
    private String bankHolderName;
    private int bankBalance;

    HDFCBank(String bankHolderName, int bankBalance){
        this.bankHolderName=bankHolderName;
        this.bankBalance=bankBalance;
    }

    public String getBankHolderName() {
        return bankHolderName;
    }

    public void setBankHolderName(String bankHolderName) {
        this.bankHolderName = bankHolderName;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
}
