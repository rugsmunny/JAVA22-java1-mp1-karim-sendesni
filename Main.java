import java.util.Random;
import java.util.Scanner;

class InitField{
    static int gissning, gissningar = 0, slumpNummer;

    static boolean run = true;

    static Scanner in = new Scanner(System.in);
}
public class Main extends InitField{
    public static void main(String[] args) {

        while(run) {
            runGame();
        }
    }

    static void runGame(){
        slumpNummer = new Random().nextInt(101);
        System.out.print("Gissa på ett nummer från 0 till och med 100: ");
        do{
        playerInput();
        }while(evaluatePlayerGuess( gissning, slumpNummer) != slumpNummer);
        System.out.println("Grattis! du gissade rätt! Antal gissningar: " + gissningar + "\n");
        continueQuestion();

    }
    static void playerInput(){
        gissning = in.nextInt();
        gissningar++;
        in.nextLine();
    }
    static int evaluatePlayerGuess(int gissning, int slumpNummer){
        if ((gissning > slumpNummer)) {
            System.out.println("För högt");

        } else if (gissning < slumpNummer) {
                System.out.println("För lågt");

        }return gissning;

    }
    static void continueQuestion(){
        System.out.print("Fortsätta = j / n: ");
        if(in.nextLine().equalsIgnoreCase("n"))
            run = false;
    }
}






    }
}
