package se309.lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C c = new C();

        System.out.println("Please enter the first number:");
        int n1 = sc.nextInt();

        System.out.println("Please enter the second number:");
        int n2 = sc.nextInt();

        A b = new B(n1,n2,c);
        b.caller();

    }
}

class C {
    int sum(int a, int b){
        return a+b;
    }
}
