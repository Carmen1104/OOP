import java.util.Scanner;

public class no14 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        int t = time.nextInt();

        int hour = t / 3600;
        int min = (t - hour * 3600) / 60;
        int sec = t % 60;

        System.out.print(t + " seconds are " + hour + " hour(s), " + min + " minute(s), and " + sec + " second(s)" );
    }
}
