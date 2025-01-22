package Programs;

public class PrintATableUsingPrintf {
    public static void main(String[] args){
        int num=9;
        System.out.println("The table of nine is as follows: ");
        System.out.printf("%dX1=%d\n",num,num*1);
        System.out.printf("%dX2=%d\n",num,num*2);
        System.out.printf("%dX3=%d\n",num,num*3);
        System.out.printf("%dX4=%d\n",num,num*4);
        System.out.printf("%dX5=%d\n",num,num*5);
        System.out.printf("%dX6=%d\n",num,num*6);
        System.out.printf("%dX7=%d\n",num,num*7);
        System.out.printf("%dX8=%d\n",num,num*8);
        System.out.printf("%dX9=%d\n",num,num*9);
        System.out.printf("%dX10=%d\n",num,num*10);

        /*int mulFac;
        for(mulFac=1;mulFac<=10;mulFac++){
            System.out.println("9 * "+mulFac+" = "+ (num*mulFac));
        }*/
    }
}
