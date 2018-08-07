package zlearning;

import java.util.Scanner;

public class Zlearning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= array[i];
        }
        System.out.println(product);
    }

}
