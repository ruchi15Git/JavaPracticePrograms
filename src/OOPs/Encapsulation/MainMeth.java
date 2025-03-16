package OOPs.Encapsulation;

public class MainMeth {
    public static void main(String[] args){
        HDFCBank hdfcBank=new HDFCBank("Ruchi",200);
        System.out.println(hdfcBank.getBankHolderName());
        System.out.println(hdfcBank.getBankBalance());
        hdfcBank.setBankHolderName("Anjali");
        hdfcBank.setBankBalance(400);
        System.out.println("Name: "+hdfcBank.getBankHolderName()+", Balance: "+hdfcBank.getBankBalance());
    }
}
