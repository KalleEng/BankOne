import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bliMedlem extends Person {

    private final String members = "src/Konton.txt";


    public void saveMembers(String personnummer, String lösenordNamn) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(members, true))) {
            bufferedWriter.write(personnummer + "\n");
            bufferedWriter.write(lösenordNamn + "\n");
            System.out.println("Konto skapat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getMembers() {
        return members;
    }
}