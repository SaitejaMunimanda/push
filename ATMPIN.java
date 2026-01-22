
import java.util.Scanner;

public class ATMPIN {
    public static void main(String[] args) {
        int pin = 1234;
        //int enter = 2345;
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter ATMPIN : ");
        int enter = scanner.nextInt();

        try {
            if (pin == enter) {
                System.out.println("PIN Verified. Access Granted.");
            }else{
                System.out.println("Invalid PIN.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
