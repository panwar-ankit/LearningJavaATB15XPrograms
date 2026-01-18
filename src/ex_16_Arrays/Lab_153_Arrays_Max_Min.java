package ex_16_Arrays;

public class Lab_153_Arrays_Max_Min {
    static void main(String[] args) {

        int[] array = {25,26,27,28,29,30};
       // Arrays.sort(array);
        //System.out.println(array[array.length-1]);

        int max = array[0];
        for (int i = 0; i < array.length; i++){

            if (array[i] > max) {
                max = array[i];
            }
        }

    }
}
