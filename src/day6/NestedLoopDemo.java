package day6;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.println(i +" "+j);
                if(j == 3){
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("Out from loop.");
    }
}
