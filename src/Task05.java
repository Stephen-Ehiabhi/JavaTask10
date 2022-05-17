import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task05 {
    public static void main(String []args) throws IOException {
        System.out.println("Please enter the first three digits of your bank account");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String digits= rd.readLine();
        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            String line;
            System.out.println("Searching ...");
            while((line= br.readLine())!=null){
//                System.out.println(line);
                // Putting Data into an array
                String[] words=line.split("\\t+");
                String BankNumberAzougar56473=words[0].trim();
                String BankNameAzougar56473=words[1].trim();
                if(BankNumberAzougar56473.equals(digits)){
                    System.out.println("Done ");
                    System.out.println("Bank Digits : " +BankNumberAzougar56473 + "\nBank Name : " +BankNameAzougar56473);
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("Data Loading Failed");
        }

    }
}
