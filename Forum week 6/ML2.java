import java.util.Scanner;

public class ML2 {
    public static void main(String[] args) {
        Scanner printArrayInStars = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = printArrayInStars.nextInt();
        int [] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items (seperated by space) ");
        for (int i= 0; i < items.length; ++ i){
            items[i] = printArrayInStars.nextInt();
        }
        for (int i = 0; i < items.length; ++i){
            System.out.print(i + ":");

            for (int j = 1; j <= items[i]; ++j){
                System.out.print("*");
            }
            System.out.println("(" + items[i] + ")");
        }
    }
}
