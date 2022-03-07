import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);  
        System.out.println("Enter first number:");
        int x1 = num.nextInt();

        System.out.println("Enter second number:");
        int x2 = num.nextInt();
        
        System.out.println("Enter third number:");
        int x3 = num.nextInt();

        double m = (x1 + x2 + x3) / 3;
        double v = (Math.pow((x1 - m), 2) + Math.pow((x2 - m), 2) + Math.pow((x3 - m), 2)) / 3;
        double st = Math.sqrt(v);

        System.out.println("The mean is " + m);
        System.out.println("The variance is " + String.format("%.2f", v));
        System.out.println("The standard deviation is " + String.format("%.2f", st));
    }
}
