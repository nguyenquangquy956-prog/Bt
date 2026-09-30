package BT;
import java.util.Scanner;
public class if1_8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the language you use:");
        String language = scanner.next();
        String text1 =  "The language you use: " ;
        switch (language.toUpperCase()) {
            case "A":
                System.out.println(text1 + "Ads");
                break;
            case "B":
                System.out.println(text1 + "Basic");
                break;
            case "C":
                System.out.println(text1 + "Cobol");
                break;
            case "D":
                System.out.println(text1 + "dBase III");
                break;
            case "F":
                System.out.println(text1 + "Fortran");
                break;
            case "P":
                System.out.println(text1 + "Pascal");
                break;
            case "V":
                System.out.println(text1 + "Visual C++");
                break;
            default:
                System.out.println("Please enter a supported language.");
                break;
        }
    }
}