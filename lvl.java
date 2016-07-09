package vumork;

import static java.lang.System.out;

public class lvl {
    int lvlnumber = 1;
    int usrpts = 0;
    int lvlcont = 50;
    String usrnm =("");
    String usrtit = (" \"El lambusio\"");
    
    public void lvlcalc(int usrpts){
        this.usrpts = usrpts;
        if (usrpts<50){
            out.println("Cliente: "+usrnm+usrtit+".");
            out.println(("Level: ")+lvlnumber);
            out.println("Exp.: "+usrpts+"/"+lvlcont);
            
        }else{
        if (usrpts>=50 && usrpts<=100){
            lvlnumber = lvlnumber+1;
            lvlcont = lvlcont*2;
            usrtit = (" \"El tragon\"");
            out.println("Cliente: "+usrnm+usrtit+".");
            out.println(("Level: ")+lvlnumber);
            out.println("Exp.: "+usrpts+"/"+lvlcont);
            }
        }
    
    }
}
