public class pattern_3 {
    public void pattern3(int n) {

        for (int i = 0; i < n / 2 + 2; i++) {
            for (int j = 0; j < n / 2 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.print(" ".repeat(n / 2 + 1) + "*".repeat(1) + " ".repeat(n / 2 + 1) + "*".repeat(i + 1));
            System.out.println();
        }
        for (int i = n / 2; i < n / 2 + 1; i++) {
            System.out.print(" ".repeat(n / 2 + 1) + "*".repeat(n / 2 + n / 2 + 2 + 2));
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.print(" ".repeat(n / 2 + 1) + "*".repeat(1) + " ".repeat(n / 2 + 1) + "*".repeat(n / 2 - i + 1));
            System.out.println();
        }

        // next half part
        for (int i = 0; i < n/2+2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(n-i-n/2+1));
            System.out.print("*".repeat(n / 2 - i+1));
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern_3 pattern = new pattern_3();
        pattern.pattern3(3);
        System.out.println();
        System.out.println();
        pattern.pattern3(5);
        System.out.println();
        System.out.println();
        pattern.pattern3(7);
    }

}
