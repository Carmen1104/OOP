import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");

        float c = temp.nextFloat();
        float f = (c / 5 * 9) + 32;

        System.out.println(c + " Celsius degrees are " + f + " Fahrenheit degrees");
    }
}
