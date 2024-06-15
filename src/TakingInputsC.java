import java.util.Scanner;

public class TakingInputsC {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a Word");
        char character = sc.nextLine().charAt(0);
        System.out.println("Character: " + character);
        sc.close();
    }
}
