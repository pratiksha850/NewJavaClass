package assignment8;
import java.util.*;
import java.io.*;
public class Q_39 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter your first name:\t");
        char firstName=br.readLine().charAt(0);

        System.out.print("\nEnter middle Name:\t");
        char midName=br.readLine().charAt(0);

        System.out.print("\nEnter your last name:\t");
        String lastname=br.readLine();

        System.out.println("\n Abbreviated Name:\t"+firstName+"."+midName+"."+lastname);

    }
}
