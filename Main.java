import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gissning, gissningar = 0, slumpNummer;

        boolean run = true;

        Scanner in = new Scanner(System.in);


        while(run){
            slumpNummer = new Random().nextInt(101);
            System.out.print("Gissa på ett nummer från 0 till och med 100: ");
            do{
                gissning = in.nextInt();
                gissningar++;
                in.nextLine();
                if (gissning > slumpNummer)
                    System.out.println("För högt");
                if(gissning < slumpNummer)
                    System.out.println("För lågt");
            }while(gissning != slumpNummer);
            System.out.println("Grattis! du gissade rätt! Antal gissningar: "+gissningar+"\n");
            System.out.print("Fortsätta = j / n: ");
            ;
            if(in.nextLine().equalsIgnoreCase("n"))
                run = false;
        }







    }
}