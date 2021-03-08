package project1;

import java.util.Scanner;

public class FoodOrderingApp {

    public static void main(String[] args) {
        boolean isValidMenuType=false;
        Scanner in = new Scanner(System.in);
        System.out.println("How many people are ordering?");
        int numberOfPeopleOrdering=in.nextInt();
        int menuType=0;
        if(numberOfPeopleOrdering>=10){
        while(!isValidMenuType) {
            //Scanner in = new Scanner(System.in);
            displayMainMenu();
            System.out.println("Choose what tpe of food you would like to order:");
             menuType = in.nextInt();

            switch (menuType) {
                case 1:
                    displayItalianFoodMenu();
                    isValidMenuType=true;
                    break;
                case 2:
                    displayChineseFoodMenu();
                    isValidMenuType=true;
                    break;
                case 3:
                    displayAmericanFoodMenu();
                    isValidMenuType=true;
                    break;
                default:
                    System.out.println("Choose appropriate number for food type");
                    isValidMenuType=false;
            }
        }
            System.out.println("Which food tray to order:");
            int selectedFoodItem=in.nextInt();

            //calculating feeds - how? use substring or following
            int feeds =0;
            double price=0.00;
            if(selectedFoodItem==1 && menuType==1 ) {
                feeds = 5;
                price = 17.99;
            }
            else if(selectedFoodItem==2 && menuType==1 ) {
                feeds = 7;
                price = 15.99;
            }
            else if(selectedFoodItem==3 && menuType==1 ) {
                feeds = 4;
                price = 12.99;
            }
            else if(selectedFoodItem==1 && menuType==2 ) {
                feeds = 7;
                price=18.99;
            }
            else if (selectedFoodItem == 2 && menuType == 2){
                feeds = 7;
                price=18.99;
            }
            else if(selectedFoodItem==3 && menuType==2) {
                feeds = 5;
                price=10.99;
            }
            else if(selectedFoodItem==1 && menuType==3 ) {
                feeds = 8;
                price=21.99;
            }
            else if(selectedFoodItem==2 && menuType==3) {
                feeds = 5;
                price=22.99;
            }
            else if(selectedFoodItem==3 && menuType==3) {
                feeds = 10;
                price=26.99;
            }

            int numberOfTrays = determineTrays(numberOfPeopleOrdering, feeds);
            System.out.println("You need "+ numberOfTrays+" trays.");
            System.out.println("Feeds: "+ feeds);
            double subTotal = getSubtotal( price, numberOfTrays);
            System.out.println("Price for "+numberOfPeopleOrdering+"people ("+numberOfTrays+"trays):"+subTotal);
            double taxAmount= getTax( subTotal,7);
            System.out.println("Tax: "+taxAmount);
            double tipAmount = getTip(subTotal,15);
            System.out.println("Tips: "+tipAmount);
            double gTotal = getGrandTotal(subTotal, taxAmount,  tipAmount);
            System.out.println("Total (food, tax, tip):"+gTotal);
            double ppp= pricePerPerson( gTotal, numberOfPeopleOrdering);
            System.out.println("Price per person: "+ppp);
            int leftOver=determineLeftOvers( feeds, numberOfTrays,  numberOfPeopleOrdering);
            System.out.println("LeftOver serving for the delivery person: "+leftOver);



            }else{
            System.out.println("The number of people are invalid.");
        }


    }

    public static void displayMainMenu(){
        System.out.println("1. Italian");
        System.out.println("2. Chinese");
        System.out.println("3.American");
    }

    public static void displayItalianFoodMenu(){
        System.out.println("Italian code here");
        System.out.println("1.lasagna Tray-Feeds 5 - 17.99$  ");
        System.out.println("2.Pizza Pack - Feeds 7 - 15.99$");
        System.out.println("3.Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99$");
    }
    public static void displayChineseFoodMenu(){
        System.out.println(" china code here");
        System.out.println("1.Chicken and Broccoli Tray(include 7 wontons soup, 7 egg rolls) - feeds 7 - 18.99$");
        System.out.println("2.Sweet and Sour Pork Tray(include 7 hot and sour soup, 7 egg rolls)- feeds 7 - 18.99$");
        System.out.println("3.Shrimp Fried Rice Tray(includes 10 egg rolls)-feeds 5 - 10.99$");
    }
    public static void displayAmericanFoodMenu(){
        System.out.println("American food menu");
        System.out.println("1. Hamburger and Hot Dog Tray - includes Buns and Condiments - feeds 8 - 21.99$");
        System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces - feeds 5 - 22.99$");
        System.out.println("3. Barbeque Tray - includes buns and peach cobbler - feeds 10 - 26.99$");
    }
    public static int determineTrays(int people, int feeds) {
        int numberOftray=people/feeds;
        if(people%feeds!=0)
            numberOftray+=1;
        return numberOftray;
    }
    public static double getSubtotal(double price, int trays){
        double subTotal=price*trays;
        return subTotal;
    }
    public static double getTax(double subTotal, double taxRate){
        double tax = (subTotal * taxRate )/ 100;

        return Math.round(tax*100.0)/100.0 ;
    }
    public static double getTip(double subTotal, double tipRate){
        double tip = (subTotal * tipRate )/ 100;
        return Math.round(tip*100.0)/100.0 ;
    }
    public static double getGrandTotal(double subTotal, double tax, double tip){
        double grandTotal = subTotal + tax + tip;
        return grandTotal;
    }
    public static double pricePerPerson(double grandTotal, int people){
        double pricePerPerson = grandTotal / people;
        return Math.round(pricePerPerson*100.0)/100.0 ;
    }
    public static int determineLeftOvers(int feeds, int trays, int people){
        int leftOver = (feeds * trays) - people;
        return leftOver;
    }
}
