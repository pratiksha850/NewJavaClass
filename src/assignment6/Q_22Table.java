package assignment6;

public class Q_22Table {
    public static void main(String[] args) {
        int tableSize =10;
        printTable(tableSize);
    }
    public static void printTable(int tableSize){
      System.out.format("     ");
        for(int i=1; i<= 10; i++){
          System.out.format("%4d", i);
      }
      System.out.println();
      System.out.println("  ********************************************");
        for(int i=1; i<= 10; i++){
            System.out.format("%4d |", i);
            for(int j=1; j<=10; j++){
                System.out.format("%4d", i*j);
            }
            System.out.println();
        }

    }
}
