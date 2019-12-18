import java.util.*;
import java.util.*;

public class Main {

//    public static String FirstReverse(String str) {
//        System.out.println("hello");
//    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String input = "Hello from codeup";

        byte [] strAsByteArray = input.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];


        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =
                    strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
    }
}


