package OOPs.AccessModifiers;

import OOPs.AccessModifiers.Criminal.Theif;
import OOPs.AccessModifiers.Police.Cop;
import OOPs.AccessModifiers.Police.JrCop;

public class MainMethod {
    public static void main(String[] args){
        Cop cop=new Cop(200);
        cop.CanIShoot();
        Theif theif=new Theif(20);
        JrCop jrCop=new JrCop(30);

    }
}
