import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banksystem banksystem = new Banksystem();

        while(true){
            System.out.print("Skriv 1 för att logga in eller 2 för att registerar dig: ");
            Scanner scan = new Scanner(System.in);
            String choice = scan.next();

            if (choice.equals("1")){
                banksystem.logIn();
            } else if (choice.equals("2")) {
                banksystem.registerMember();
            } else {
                System.out.println("Ogiltigt val. Försök igen");
            }
        }

    }
}

