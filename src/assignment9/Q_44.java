package assignment8;

import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class Q_44 {
    String name;
    System emailAddress;

    public static void main(String[] args) {
        File file = new File("C:\\Users\\18505\\IdeaProjects\\NewJavaClass\\address.txt");

        //Scanner scanner = new Scanner(System.in);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader (fileReader);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEnter your first name:\t");
            String nameConsole=br.readLine();
            //System.out.println(name);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String nameFile=line.substring(0,line.indexOf("="));
                if(nameFile.equalsIgnoreCase(nameConsole.toLowerCase())) {
                    String address =line.substring(line.indexOf("=") + 1);
                    System.out.println(address);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
