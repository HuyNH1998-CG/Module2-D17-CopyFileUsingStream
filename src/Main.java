import java.io.*;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingStream(File source, File dest){
        InputStream is;
        OutputStream os;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer,0,length);
            }
            System.out.println("Work complete");
            is.close();
            os.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input file path");
        String filePath = input.nextLine();
        System.out.println("input file destination");
        String destPath = input.nextLine();
        File source = new File(filePath);
        File copy = new File(destPath);
        copyFileUsingStream(source,copy);

    }
}
