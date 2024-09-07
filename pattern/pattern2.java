
//                *
//                **
//        ****eeee***
//   *    ****    **
//  **    ****    *
// ***eeee****
//  **
//   *


public class pattern2 {
    public void evenPattern(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < n / 2 + n + n + n + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print(" ".repeat(n / 2 + n + 1));
        System.out.print("*".repeat(n));
        System.out.print("e".repeat(n));
        System.out.print("*".repeat(n - 1));
        System.out.println();

        // part 2
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.print("*".repeat(n - 1));
        System.out.print("e".repeat(n));
        System.out.print("*".repeat(n));
        System.out.println();

        // next part
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2 - 1 + i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2 pattern2 = new pattern2();
        pattern2.evenPattern(4);
    }
}
