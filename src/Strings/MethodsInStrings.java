package Strings;

public class MethodsInStrings {
    public static void main(String[] args){
        //1. length()
        String s="Anjali";
        System.out.println(s.length()); //6

        //2. charAt()
        System.out.println(s.charAt(5)); //i

        //3. concat()
        System.out.println(s.concat(" Chate")); // Anjali Chate

        //4. contains()
        System.out.println(s.contains("Ruchi")); // false
        System.out.println(s.contains("jali")); //true

        //5. equals()
        String s1="Anjali";
        String s2="anjali";
        System.out.println(s.equals(s1)); // true
        System.out.println(s.equals(s2)); // false( case sensitive)

        //6. equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s2));

        //7. indexOf()
        System.out.println(s1.indexOf('a')); //3
        System.out.println(s1.indexOf('r')); //-1

        //8. replcae()
        String result=s1.replace("Anjali","Ruchi");
        System.out.println(result); //Ruchi

        //9. split()
        String str= "Java is Awesome.!";
        String[] split =str.split(" ");
        for(String splittedPart: split){
            System.out.println(splittedPart);
        }
        /*System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

         */

        //10. substring() --startIndex
        String string="Hello, Java!";
        String res=string.substring(7);
        System.out.println(res); //java!

        //11. substring() -- startIndex and endIndex
        String resp=string.substring(7,11);
        System.out.println(resp); //Java

        //12. startsWith()
        boolean out=string.startsWith("H");
        System.out.println(out); //true

        //13. endswith()
        String name1="Hey, Ruchi!";
        boolean response= name1.endsWith("Ruchi!");
        System.out.println(response); //true

        //14. trim()
        String space="   Anjali    ";
        System.out.println(space.trim());

        //15. compareTo()
        String str1= "Anjali";
        String str2="Anjali";
        int resStr=str1.compareTo(str2);
        System.out.println(resStr); //0

        //16. compareToIgnoreCase()
        String nm1="Ruchi";
        String nm2="ruchi";

        int resStr1= nm1.compareToIgnoreCase(nm2);
        System.out.println(resStr1); //0

    }
}
