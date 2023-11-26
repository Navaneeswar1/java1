import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws Exception {
        File f = new File("D:\\C-DAC(BANGALORE)\\Core_Java\\new2.txt");
        FileWriter fwrite = new FileWriter("D:\\C-DAC(BANGALORE)\\Core_Java\\new2.txt");
        fwrite.write("String is written in newly created file");
        fwrite.write(System.lineSeparator());
        fwrite.write("String is written in newly created file in line2");
        fwrite.close();

        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String filetext = sc.nextLine();
            System.out.println(filetext);
        }
    }
}
