package Assignment5;
import java.util.Scanner;
public class Q_21DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter number: ");
        int day = input.nextInt();

        System.out.println(getDayName(day));

        }
        public static String getDayName(int day) {
            String dayName = "";
            switch (day) {
                case 1:
                    dayName = "sunday";
                    break;
                case 2:
                    dayName = "Monday";
                    break;
                case 3:
                    dayName = "Tuesday";
                    break;
                case 4:
                    dayName = "Wednesday";
                    break;
                case 5:
                    dayName = "Thursday";
                    break;
                case 6:
                    dayName = "Friday";
                    break;
                case 7:
                    dayName = "Saturday";
                    break;
                default:
                    System.out.println("Wrong number.");
                    break;
            }
            return dayName;
        }
        }
