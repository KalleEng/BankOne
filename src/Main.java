import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoggaIn l = new LoggaIn();
        bliMedlem b = new bliMedlem();
        String personnummer;
        String namn;
        String Alternativ;

        while(true){
            System.out.print("Skriv 1 för att logga in eller 2 för att registerar dig: ");
            Scanner scan = new Scanner(System.in);
            Alternativ = scan.next();
            if(Alternativ.equals("1")){
                System.out.print("personnummer: ");
                Scanner scan2 = new Scanner(System.in);
                String personnummer1 = scan2.nextLine();
                System.out.print("namn: ");
                String namn1 = scan2.nextLine();
                l.loggaIn(personnummer1, namn1);
            }else if(Alternativ.equals("2")){
                System.out.print("personnummer: ");
                Scanner scan3 = new Scanner(System.in);
                personnummer = scan3.nextLine();
                System.out.print("namn: ");
                namn = scan3.nextLine();
                b.saveMembers(personnummer, namn);
            }
        }

    }
}

