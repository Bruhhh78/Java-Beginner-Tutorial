import java.util.Scanner;

public class MiniQuiz3 {
    public static void main(String[] args) {
        System.out.println("11 - This is Mini Quiz 3 file");
        /* Accept two numbers from user and swa their values using third variable */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();

        // Numbers Before Swapping
        System.out.println("Numbers Before Swapping");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);

        // Swapping the numbers
        // Suppose he num1 = 1 and he num2 =2
        num1 = num1 + num2; // 1 --> 1 + 2 => this will hold the sum so the value is now "3"
        num2 = num1 - num2; // 2 --> 3 - 2 => so ow here value of num1 is 3 and num2 is so after calculation
                            // num2 will be "1"
        num1 = num1 - num2; // 3 --> 3 - 1 => and now here value of num1 is 3 again and num2 is 1 so after
                            // calculation num1 will be "2"

        // Numbers After Swapping
        System.out.println("Numbers After Swapping");
        System.out.println("First Number after Swapping: " + num1);
        System.out.println("Second Number after Swapping: " + num2);

        sc.close();
    }
}
