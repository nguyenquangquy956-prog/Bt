package BT;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap cap do nhan vien: ");
        char grade = scanner.next().charAt(0);
        System.out.println("Hay nhap luong co ban: ");
        Double salary = scanner.nextDouble();
        int allowance = 100;
        if(salary <= 0){
            System.out.println("du lieu ko the bang 0");
            return;
        }
        if(grade == 'A' || grade == 'a'){
            allowance = 300;
        } else if(grade == 'b' || grade == 'B'){
            allowance = 200;
        }
        salary += allowance;
        System.out.println("luong tong la " + salary);
    }
}