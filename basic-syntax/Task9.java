package basicSynatx;

import java.util.Scanner;

public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n *2; i+=2){
            sum+= i;
            System.out.println(i);
        }
    }
}
