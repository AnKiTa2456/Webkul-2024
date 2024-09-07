public class Pattern {
    public void printPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void printPattern2(int n){
        for(int i = 1 ; i < n+1; i++){
            for(int j= 0; j<i ; j++){ 
                System.out.print(i + " ");
            }
            System.out.println();
        }
      
    }

    public void printPattern3(int n){
        for(int i = 1; i < n+1; i++){
            for(int j=0 ; j<i ; j++){ 
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void printPattern4(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n-i;j++){
               System.out.print(" * ");
            }
           
            System.out.println();
        }
    }
    public void printPattern5(int n ){
        for (int i = 0 ; i< n; i++){
            // for space
            for(int j = 0; j <n-i-1; j++){
                System.out.print( " ");
            }
            //for stars
            for(int k = 0 ; k<2*i + 1 ; k++){
                System.out.print( "*");
            }
            // for space
             for(int j = 0; j <n-i-1; j++){
                System.out.print( " ");
            }
           
            System.out.println();
        }
    }

    public void printPattern6(int n){
        for(int i =0 ; i<n ; i++){
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< 2*(n-i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printPattern7(int n){
         for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        // pattern.printPattern1(5); // Example input
        // pattern.printPattern2(5);
        // pattern.printPattern3(5);
        // pattern.printPattern4(5);
        // pattern.printPattern5(3);
        // pattern.printPattern6(7);
        pattern.printPattern7(3);
        pattern.printPattern7(5);
        pattern.printPattern7(7);
        
    }
}
