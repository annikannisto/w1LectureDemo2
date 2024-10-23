import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class VK1Sld36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your preferred language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Additional language (e.g., Arabic, Japanese)");
        int choice = scanner.nextInt();
        OutputGenerator outputGenerator = new OutputGenerator();
        switch (choice) {
            case 1:
                outputGenerator.generateOutput("en");
                break;
            case 2:
                outputGenerator.generateOutput("fi");
                break;
            case 3:
                outputGenerator.generateOutput("fa"); // Example: Arabic
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }



}