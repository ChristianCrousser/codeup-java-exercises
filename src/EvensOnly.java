import java.util.*;
public class EvensOnly {
    public static void main(String[] args){
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}