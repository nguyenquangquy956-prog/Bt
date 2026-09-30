package BT;
import java.util.Scanner;
public class if_else_2_2 {
    public static void main(String[] args) {
        Scanner hocsinh = new Scanner(System.in);
        System.out.println("Hay nhap ten hoc sinh: ");
        String name = hocsinh.next();
        System.out.println("Hay nhap diem hoc sinh: ");
        int point = hocsinh.nextInt();
        String text1 = "Hoc sinh " + name + " da dat hang: ";
        if(point <= 0 || point >= 100 ){
        } else if(point > 75){
            System.out.println(text1 + "A");
            return;
        } else if (point > 60 && point < 75){
            System.out.println(text1 + "B");
            return;
        } else if (point > 45 && point <60){
            System.out.println(text1 + "C");
            return;
        } else if (point > 35 && point < 45){
            System.out.println(text1 + "D");
            return;
        } else if (point < 35){
            System.out.println(text1 + "E");
            return;
        }
        System.out.println("Vui long nhap dung du lieu diem cua hoc sinh " + name);
    }
}
