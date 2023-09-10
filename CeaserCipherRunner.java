

import java.util.Scanner;

public class CeaserCipherRunner {

   public static void main(String[]args){

   Initialization init = new Initialization();
   init.initialization(); 

   while(true){

      SoftwareTools.clearScreen();

      Initialization.printWelcomeMessage();      
      System.out.print("Enter your command:");
      Scanner sc=new Scanner(System.in);
      String command = sc.nextLine();

      if(command.toLowerCase().equals("exit") || command.toLowerCase().equals("quit")){
         System.exit(0);
      }

      
      System.out.print("Enter your key (must be an integer):");
      int key = 0;
      try {
         key = sc.nextInt();
         sc.nextLine();
      } 
      catch (java.util.InputMismatchException e) {
         System.out.println("Invalid input. Please enter an integer.");
         continue;
      }


      if(command.toLowerCase().equals("encrypt")){
         System.out.print("Enter Your message: ");
         String message = sc.nextLine();
         System.out.println("Your encrypted massage is: " + CaesearCypher.encrypt(message, key));
         sc.nextLine();
      }
      else if(command.toLowerCase().equals("decrypt")){
         System.out.print("Enter Your message: ");
         String message = sc.nextLine();
         System.out.println("Your decrypted massage is: " + CaesearCypher.decrypt(message, key));
         sc.nextLine();
      }
      else
         System.out.println("Invalid command "+command);
         sc.nextLine();
      }
   }
}