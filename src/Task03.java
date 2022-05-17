import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task03 {
    public static void main(String[] args) {
        int txtint;
        try (FileInputStream fs=new FileInputStream("test123.txt");FileOutputStream fot = new FileOutputStream("newtest.txt")){
            do {
                txtint = fs.read();//read from user
                if ((char)txtint==' '){
                    txtint='-';
                }
                if (txtint != -1) {

                    fot.write(txtint);
                }
            }
            while (txtint != -1);
        System.out.println("Copied Succesfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}