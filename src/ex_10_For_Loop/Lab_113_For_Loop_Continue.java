package ex_10_For_Loop;

public class Lab_113_For_Loop_Continue {
    static void main(String[] args) {

        for (int i=0; i<=50;i++){
            if (i % 2 !=0){
                continue;

            }
            System.out.println(i);

        }
    }
}
