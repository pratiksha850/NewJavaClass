package assignment8;

public class Q_43 {
    public static void main(String[] args)
    {
        try {
            int number[] = new int[10];
            number[10] = 40 / 2;
        }
        catch (ArithmeticException e) {
            System.out.println("Zero cannot divide by any number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of size of the array");
        }
    }

}
