import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        /*
         * we have some dataType for all to Take inputs like we have nextShort(),
         * nextInt(), nextFloat(), nextDouble(), nextBoolean()
         * we have Reading String Data => nextLine() - reads the whole line,
         * next() - reads the first word
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