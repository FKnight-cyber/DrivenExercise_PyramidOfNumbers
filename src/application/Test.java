package application;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        Integer initial = sc.nextInt();

        System.out.print("Informe o número final: ");
        Integer last = sc.nextInt();

        System.out.println();

        for(Integer i = initial; i <= last; i++) {
            System.out.println(i.toString().repeat(i));
        }

        sc.close();
    }
}
