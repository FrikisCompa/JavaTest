package vumork;

public class lvl {
    int lvlnumber = 1;
    int usrpts = 35;
    int lvlcont = 50;
    String usrnm =("Becerro");
    
    public void lvlcalc(int usrpts){
        this.usrpts = usrpts;
        if (usrpts<50){
            System.out.println("hola "+usrnm+" tienes lvl "+lvlnumber+" y te faltan "+(lvlcont-usrpts)+" pts. para alcanzar el nivel "+(lvlnumber+1));
        }
    
}
}
