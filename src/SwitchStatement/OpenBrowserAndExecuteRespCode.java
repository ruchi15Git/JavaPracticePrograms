package SwitchStatement;

import java.util.Scanner;

public class OpenBrowserAndExecuteRespCode {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String browser=scanner.next();
        switch (browser){
            case "chrome":
                System.out.println("Open chrome");
                System.out.println("Execute Chrome TC");break;
            case "edge":System.out.println("Open edge browser");
            System.out.println("Run edge TC");break;
            case "firefox":System.out.println("Open firefox");break;
            default:System.out.println("browser not configured to execute test cases..");
        }
    }
}
