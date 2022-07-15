package bootcamp;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int k = 10;

        int i = ++ k;
        int j = k --;
        int x = k;

        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("x " + x);

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

        int u = 1500;
        short w = 15;
        long l = 500L;
        int y = 35;
        float f = 3.5f;
        double n = f;

        System.out.println(n);

        u += 5;
        w -= 3;
        n /= 2.7d;
        l *= 3;
        y %= 2;

        System.out.println("u: " + u);
        System.out.println("w: " + w);
        System.out.println("n: " + n);
        System.out.println("l: " + l);
        System.out.println("y: " + y);

        u = y = w;

        System.out.println("y: " + y);
        System.out.println("u: " + u);

        int i2 = 10;
        int j2 = 30;
        int k2 = 30;

        int a = i2 ++ + --j2 + k;
        System.out.println("a: " + a);

        

    }

}
