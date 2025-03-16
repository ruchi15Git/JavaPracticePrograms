package OOPs.ThisKeyword;

public class RunnerClass {
    public static void main(String[] args){
        Ex01_thisKeyword ex1= new Ex01_thisKeyword("Anjali",22);
        ex1.display();
        Mobile mobile=new Mobile("OnePlus","Nord",30000);
        mobile.displayMobileInfo();
        mobile.prize=40000; //seeting the prize to 40000 now
        System.out.println(mobile.prize); //printing the updated prize
        mobile.displayMobileInfo();
        Mobile samsung=new Mobile("Samsung","Ultra pro",50000);
        samsung.displayMobileInfo();
    }
}
