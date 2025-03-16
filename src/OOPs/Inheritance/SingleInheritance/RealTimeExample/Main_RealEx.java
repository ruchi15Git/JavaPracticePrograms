package OOPs.Inheritance.SingleInheritance.RealTimeExample;

public class Main_RealEx {
    public static void main(String[] args){
        TestCase1 tc1=new TestCase1();
        tc1.openBrowser();
        tc1.closeBrowser();
        tc1.connectDB();
        tc1.runTC01();
        TestCase2 tc2=new TestCase2();
        tc2.runTestCase2();
    }
}
