import java.util.Scanner;

public class MiniQuiz2 {
    public static void main(String[] args) {
        System.out.println("10 - This is Mini Quiz 2 file");
        /* Accept two numbers from user and swa their values using third variable */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int numA = sc.nextInt();

        System.out.println("Enter Second Number");
        int numB = sc.nextInt();

        // Printing the Original Value before Swapping It
        System.out.println("Before Swapping");
        System.out.println("First Number: " + numA);
        System.out.println("Second Number: " + numB);

        //Swapping the Values
        int swapValue = numA;
        numA = numB;
        numB = swapValue;

        // Printing the Value after Swapping It
        System.out.println("After Swapping");
        System.out.println("First Number: " + numA);
        System.out.println("Second Number: " + numB);

        sc.close();
    }
}
