public class no12 {
    public static void main(String[] args) {
        
        System.out.println("Numbers \t Square \t Cube" );

        for(int i = 0; i <= 10; i++){
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t\t" + square + "\t\t" + cube);
        }
    }
}
