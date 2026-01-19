package ex_16_Arrays;

public class Lab_164_2nd_highest_Array {
    static void main(String[] args) {

        int[] numbers = {12, 13, 14, 15, 16};
        int highest = 0;
        int secondhighest = 0;

        for (int num : numbers) {
            if (num > highest) {
                secondhighest = highest;
                highest = num;
            }else if (num > secondhighest && num!=highest){
                secondhighest = num;
            }
        }
        System.out.println(secondhighest);
    }
}