import java.util.Scanner;

public class ML1 {
    public static void main(String[] args) {

        Scanner PrintArray = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int NUM_ITEMS = PrintArray.nextInt();
        int [] items = new int[NUM_ITEMS];

        System.out.println("Enter the value of all items (seperated by space)");
        for (int i= 0; i < items.length; ++ i){
            items[i] = PrintArray.nextInt();
        }

        System.out.print("The values are: [");

        for (int i = 0; i < items.length; ++i) {
            System.out.print(items[i] + ", ");
        }

    System.out.print("]");
    }
}
