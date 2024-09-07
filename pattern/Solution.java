
//                              *
//                              **
//                              ***
//                              ****
//              ********eeeeeeee*****
//              ********        ****
//              ********        ***
//              ********        **
//     *eeeeeeee********        *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *
public class Solution {
    public static void nStarTriangle(int n) {

        // First upper part
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 1; j <= ((n / 2) + 2 + 3 * n + 3); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // middile one that contain space, e, *, spaces and *
        System.out.print(" ".repeat((n / 2 + 2) + (n + 1)));
        System.out.print("*".repeat(n + 1));
        System.out.print("e".repeat(n + 1));
        System.out.println("*".repeat(n / 2 + 2));

        // for loweer part of this
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2 + 2 + n + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(" ".repeat(n / 2 + 1));
        System.out.print("*");
        System.out.print("e".repeat(n + 1));
        System.out.print("*".repeat(n + 1));
        System.out.print(" ".repeat(n + 1));
        System.out.println("*");

        // last pyramid half part
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.nStarTriangle(7);
        System.out.println();
        Solution.nStarTriangle(5);
        System.out.println();
        Solution.nStarTriangle(3);
        System.out.println();
        Solution.nStarTriangle(11);

    }
}
