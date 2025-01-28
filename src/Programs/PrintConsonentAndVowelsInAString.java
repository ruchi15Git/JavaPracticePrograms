package Programs;

public class PrintConsonentAndVowelsInAString {
    public static void main(String[] args){
        String name="Ruchi";
        int vowelsCount=0;
        int consonentCount=0;
        String str=name.toLowerCase();
        //System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowelsCount++;
            }else if(str.charAt(i)>='a' || str.charAt(i)<='z'){
                consonentCount++;
            }
        }
        System.out.println("Vowels in a given string: "+vowelsCount);
        System.out.println("Consonent in a given string: "+consonentCount);
    }
}
