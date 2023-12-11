import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LoggaIn {
    private final String members = "src/Konton.txt";

    public void loggaIn(String personnummer, String LösenordÄrNamn) {
        try (Scanner fileScanner = new Scanner(new File(members))) {
            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String Rpersonnummer = fileScanner.nextLine();
                String Rnamn = fileScanner.nextLine();

                if (Rpersonnummer.equals(personnummer) && Rnamn.equals(LösenordÄrNamn)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Du loggades in");
            } else {
                System.out.println("Du skrev in fel namn eller personnummer");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}