package BT;
import java.util.Scanner;
public class if_else_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap du lieu 1: ");
        int A = input.nextInt();
        System.out.println("hay nhap du lieu 2: ");
        int B = input.nextInt();
        int C = A - B;
        if(C == A || C == B){
            System.out.println("Difference is equal to value " + C + ".");
            return;
        }
        System.out.println("Difference is not equal to any of the values entered");
    }
}