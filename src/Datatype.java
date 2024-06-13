public class Datatype {
    public static void main(String[] args) {
        /*
         * Whole Numbers - byte,short,int,long
         * Floating Numbers - float, double
         * Non Primitive - char, boolean, String
         */

        // Whole Numbers Data Types : byte, short, int, long
        int integerValue = 2147483647; // and negative me -2147483648 - me ek jyada hoti hai
        long longValue = 2147483648L; // for long value hme "L" ya "l" lagana pdta hai small captial koi bhi

        // Floating Numbers Data Types : float, double
        float decimalValue = 1.0F; // for float we have to use "F" or "f" to make its data type float
        double doubleValue = 2.0; // default value for decimal is always se to "DOUBLE"

        // Non Primitive Data Types: char, boolean, String
        char charaterValue = 'a'; // this datatype only save one character ASCII charater se bhi number pass krke
                                  // value de skte hai
        char asciiCharValue = 65; // example for ASCII char
        String nameStringValue = "My Name is Anmol Srivastava"; // isme hum log koi bhi ek string use kr skte hai lik
                                                                // enaam likhna ho ya koi text

        System.out.println("4- This is Datatype file.");
        System.out.println("Value of int is DataType : " + integerValue);
        System.out.println("Value of long DataType : " + longValue);
        System.out.println("Value of float DataType : " + decimalValue);
        System.out.println("Value of double DataType : " + doubleValue);
        System.out.println("Value of char DataType : " + charaterValue);
        System.out.println("Value of ASCII Char : " + asciiCharValue);
        System.out.println("Value of String DataType : " + nameStringValue);
    }
}