import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContactsFromFile {
    private String contactFile = "src/contacts.txt";
    
    
    public void getContacts() {
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(contactFile))){
            String txt;
            while ((txt = reader.readLine()) != null) {
                builder.append(txt).append("\n");
            }
            System.out.println(builder);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

