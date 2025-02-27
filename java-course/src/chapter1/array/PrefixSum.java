package chapter1.array;

public class PrefixSum {
    public static void main(String[] args) {
        int[] num = {2, 5, 8};
        int sum = 0;

        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        System.out.println("누적합 : " + sum);
    }
}
