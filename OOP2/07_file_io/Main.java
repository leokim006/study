import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("sample_euckr.txt");
            int ch;
            while ((ch = in.read()) != -1) {
                System.out.print((char)ch);
            }
            in.close();

            InputStream ins = new FileInputStream("sample_euckr.txt");
            InputStreamReader reader = new InputStreamReader(ins, "EUC-KR");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } // finally {
        //    in.close();
        //}
    }
}
