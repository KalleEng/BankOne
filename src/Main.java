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
        while (true) {
            System.out.println("1. Insättning\n2. Uttag\n3. Se saldo\n4. Kontakta oss\n5. Logga ut");
            int userChoice = s.nextInt();
            s.nextLine();

            switch (userChoice) {
                case 1:
                    f.showBalance();
                    System.out.println("Skriv in belopp att sätta in: ");
                    double DepositAmount = s.nextDouble();
                    try {
                        if (DepositAmount >= 0) {
                            f.deposit(DepositAmount);
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    f.showBalance();
                    System.out.println("Skriv in belopp att ta ut (t.ex -belopp)");
                    double withdrawAmount = s.nextDouble();
                    try {
                        if (withdrawAmount < 0) {
                            f.withdraw(-withdrawAmount);
                        } else {
                            System.out.println("Beloppet måste vara mindre än 0");
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    f.showBalance();
                    break;
                case 4:
                    c.getContacts();
                    break;
                case 5:
                    System.out.println("Du är nu utloggad.");
                    s.close();
                    System.exit(0);
                    break;
            }
        }
        
    }
}





