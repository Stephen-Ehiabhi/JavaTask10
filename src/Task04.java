import java.io.*;

class DataManagement{
    String FullNameAzougar56473 ;
     void readDataAzougar56473() throws IOException {
         BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
         System.out.println(" Please Enter Your Full Name");
         FullNameAzougar56473=rd.readLine();
    }
    void WriteDataToFileAzougar56473(){
         try(FileWriter fr = new FileWriter("task04.txt")) {
             fr.write(FullNameAzougar56473);
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
    void ReadDataFromFileAzougar56473(){
         String result;
         try(BufferedReader br = new BufferedReader(new FileReader("task04.txt"))) {
             while((result=br.readLine()) !=null){
                 System.out.println(result);
             }
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
    }

}
public class Task04 {
    public static void main(String []args) throws IOException {
        DataManagement obj = new DataManagement();
        obj.readDataAzougar56473();
        obj.WriteDataToFileAzougar56473();
        System.out.println("--------------------------------------------------");
        obj.ReadDataFromFileAzougar56473();
    }
}
