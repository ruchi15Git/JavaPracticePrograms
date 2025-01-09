public class SwappingOfTwoNumbers {
    public static void main(String[] args){
        int a=10, b=20, temp=0;
        System.out.println("The value of a before swapping is: "+a);
        System.out.println("The value of b before swapping is: "+b);
        temp=b;
        b=a;
        a=temp;
        System.out.println("The value of a after swapping: "+a);
        System.out.println("The value of b after swapping: "+b);
    }
}
