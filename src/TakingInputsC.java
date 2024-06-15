import java.util.Scanner;

public class TakingInputsC {
    public static void main(String[] args){
        System.out.println("9 - This is Taking Character Input file");
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a Word");
        char character = sc.nextLine().charAt(0);
        System.out.println("Character: " + character);
        sc.close();
    }
}
