package BT;
public class for_1_2 {
    public static void main(String[] args) {
        int num1 = 1,num2 = 265;
        int lower = Math.min(num1, num2);
        int upper = Math.max(num1, num2);
        int sum = 0;
        for (int number = lower + 1; number < upper; number++) {
        if (number % 2 != 0) {
                sum += number;
               }
        }
        System.out.println(sum);
    }
}