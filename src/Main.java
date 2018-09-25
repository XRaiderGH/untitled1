public class Main {

    public static void main(String[] args) {
        System.out.println("je stinkt");

        //data types String int double float boolean byte

        String henk = "henk";
        henk = "piet";

        System.out.println(henk);
        //^^^^print variabele henk

        //System.out.println("henk");
        //^^^^ print gewoon henk uit
        int leeftijd = 38;
        leeftijd = leeftijd + 6;
        leeftijd +=6;
        //leeftijd++;
        System.out.println(leeftijd);

        float snelsteTijd = 56.66f;
        double nogPreciezer =56.66666666666666666666669d;

        boolean snapHet = false;
        if(snapHet) {
            System.out.println("ik snap het");
        }else{
            System.out.println("wtf????");
        }

    }
}
