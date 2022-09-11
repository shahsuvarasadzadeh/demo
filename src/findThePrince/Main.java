package findThePrince;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i, i1, j ,
                j1 ;
        int d=0,e=0,q=0,w=0;
        char m = 'm';
        char p = 'p';
        char[][] c = new char[a][a];
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                c[i][j] = s.next().charAt(0);

                if (m == c[i][j]) {
                    q=i;
                    w=j;
                }

                if (p == c[i][j]) {
                    d=i;
                    e=j;
                }
            }
        }

        while (q!=d) {
            if (q > d) {
                d++;
                System.out.println("up");

            } else if (q < d) {
                d--;
                System.out.println("Down");

            }
        }
        while (e != w) {
            if (e > w) {
                w++;
                System.out.println("Right");
            } else if (e < w) {
                w--;
                System.out.println("Left");
            }
        }
    }
}
