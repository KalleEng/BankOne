import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        LoggaIn l = new LoggaIn();
        ContactsFromFile c = new ContactsFromFile();
        bliMedlem b = new bliMedlem();
        Functions f = new Functions();
        String personnummer;
        String namn;
        String Alternativ;

        while (true) {
            System.out.print("Skriv 1 för att logga in eller 2 för att registerar dig: ");
            Scanner scan = new Scanner(System.in);
            Alternativ = scan.next();
            if (Alternativ.equals("1")) {
                System.out.print("personnummer: ");
                Scanner scan2 = new Scanner(System.in);
                String personnummer1 = scan2.nextLine();
                System.out.print("namn: ");
                String namn1 = scan2.nextLine();
                l.loggaIn(personnummer1, namn1);
                break;
            } else if (Alternativ.equals("2")) {
                System.out.print("personnummer: ");
                Scanner scan3 = new Scanner(System.in);
                personnummer = scan3.nextLine();
                System.out.print("namn: ");
                namn = scan3.nextLine();
                b.saveMembers(personnummer, namn);
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Välkommen!");
        System.out.println("För insättnig, tryck 1: ");
        System.out.println("För uttag, tryck 2: ");
        System.out.println("För att se saldo, tryck 3");
        System.out.println("Kontakta oss, tryck 4");
        System.out.println("För att avsluta, skriv avsluta.");
        while (true) {
            String userInput = s.nextLine();
            if (userInput.equals("1")) {
                f.showBalance();
                System.out.println("Skriv in belopp att sätta in: ");
                String input = s.nextLine();
                try {
                    double amount = Double.parseDouble(input);
                    if (amount >= 0) {
                        f.deposit(amount);
                    } else {
                        System.out.println("Belopp måste vara mer än 0");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            } else if (userInput.equals("2")) {
                f.showBalance();
                System.out.println("Skriv in belopp att ta ut (t.ex -belopp)");
                String input = s.nextLine();
                try {
                    double amount = Double.parseDouble(input);
                    if (amount < 0) {
                        f.withdraw(-amount);
                    } else {
                        System.out.println("Beloppet måste vara mindre än 0");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            } else if (userInput.equals("3")) {
                f.showBalance();

            } else if (userInput.equals("4")) {
                c.getContacts();

            } else if (userInput.equalsIgnoreCase("Avsluta")) {
                break;
            }
        }
    }
}





