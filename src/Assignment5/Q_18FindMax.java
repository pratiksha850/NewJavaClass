package Assignment5;

public class Q_18FindMax {
    public static int findMax(int a, int b, int c) {
        int max = 0;
            if (a > b && a > c) {
                max = a;
            } else if(b>a && b > c) {
                max = b;
            }else {
                max = c;
            }
                return max;
        }
        public static void main (String[]args){
            int m = findMax(5, 4, 8);
            System.out.println("Max number is: " + m);
        }
    }
