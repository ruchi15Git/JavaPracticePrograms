package OOPs.ThisKeyword;

public class Mobile {
    String mobileName;
    String modelName;
    double prize;

    Mobile(String mobileName_c, String modelName_c, double prize_c){
        this.mobileName=mobileName_c;
        this.modelName=modelName_c;
        this.prize=prize_c;
    }

    public void displayMobileInfo(){
        System.out.println("Mobile name is: "+this.mobileName);
        System.out.println("Model name is: "+this.modelName);
        System.out.println("Prize is: "+this.prize);
    }

}
