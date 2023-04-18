import java.util.*;

import static java.lang.Float.sum;


public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 15, 14, 4, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }

        }
        System.out.println(sum);
    }
}

