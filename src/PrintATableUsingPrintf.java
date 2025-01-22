public class PrintATableUsingPrintf {
    public static void main(String[] args){
        int num=9;
        int mulFac;
        for(mulFac=1;mulFac<=10;mulFac++){
        // System.out.println("9 * "+mulFac+" = "+ (num*mulFac));
         System.out.printf("%d*1=%d\n",num,num*mulFac);
        }
    }
}
