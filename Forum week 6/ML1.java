import java.util.Scanner;

public class ML1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int TItems = input.nextInt();
        int [] items = new int[TItems];

        System.out.println("Enter the value of all items (seperated by space)");
        for (int i= 0; i < items.length; ++ i){
            items[i] = input.nextInt();
        }

        System.out.print("The values are: [");

        for (int i = 0; i < items.length; ++i) {
            System.out.print(items[i] + ", ");
        }

    System.out.print("]");
    }
}
