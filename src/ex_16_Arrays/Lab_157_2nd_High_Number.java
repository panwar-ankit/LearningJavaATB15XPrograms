package ex_16_Arrays;

import java.util.Arrays;

public class Lab_157_2nd_High_Number {
    static void main(String[] args) {

        int[] numbers = {12,24,36,48,60};


        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
