package EncryptionTool;
import java.util.Scanner;
public class Initialization {
    public static void printWelcomeMessage() {
        String title = SoftwareTools.WELCOME;
        String border = "+------------------------------------------+";

        System.out.println(border);
        System.out.println("|                                          |");
        System.out.println("|  " + centerText(title, 40) + "|");
        System.out.println("|                                          |");
        System.out.println(border);
    }

    public static String centerText(String text, int width) {
        int padding = Math.max(0, width - text.length());
        int leftPadding = padding / 2;
        int rightPadding = padding - leftPadding;
        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
    }

    public void initialization(){
        Scanner scanner = new Scanner(System.in);

        SoftwareTools.clearScreen();

        System.out.print(SoftwareTools.TERMS_AND_CONDITIONS);

        String yesOrNO = scanner.nextLine();
        
        if(yesOrNO.toLowerCase().equals(SoftwareTools.YES)){

            SoftwareTools.clearScreen(); 

            printWelcomeMessage();

            for(int delay=0; delay<8; delay++){
                try {
                    System.out.print(".");
                    Thread.sleep(250);
                } 
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            
            System.out.println();
        }

        else{
            SoftwareTools.clearScreen(); 

            System.out.println(SoftwareTools.END_MASSAGE);
            System.exit(0);
        }
       
    }
}
