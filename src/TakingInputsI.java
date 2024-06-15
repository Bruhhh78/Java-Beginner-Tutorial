import java.util.Scanner;

public class TakingInputsI {
    public static void main(String[] args) {
        /*
         * we have datatypes for numbers like we have => nextShort(), nextInt(),
         * nextFloat(), nextDouble(), nextBoolean()
         * we have datatypes for String Data => nextLine() - reads the whole line,
         * next() - reads the first word
         * we have datatypes for char data => nextLine().charAt(0)
         */
        System.out.println("7 - This is Taking Input  file");

        Scanner sc = new Scanner(System.in); // For taking input
        System.out.println("Please Koi Value Dedo Cutie💖");
        int a = sc.nextInt();
        System.out.println("Please Ek Aur Value Dedo Cutie🥹");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Cutie Aapke Diye Hue Value ka Sum hai: " + sum + " 🤗");
        sc.close();
    }
}