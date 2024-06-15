import java.util.Scanner;

public class TakingInputsS {
    public static void main(String[] args) {
        System.out.println("8 - This is Taking String Input file");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text: ");
        // String Text = sc.nextLine();
        /*
         * net me sirf ek word vo leta hai but haan yeh hai ki jo bcha hua text hota hai
         * vo "buffer" me save ho jata hai with space usko hm output me dekh skte hai neeche
         */
        String TextLine = sc.next();
        System.out.println("Text you wrote is: " + TextLine);
        String remainTextLine = sc.nextLine();
        System.out.println("Remaining text is: " + remainTextLine);
        sc.close();
    }
}