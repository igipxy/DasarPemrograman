package JobSheet11;

public class Recrusive10 {
    static int factorialRecrusive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecrusive(n - 1);
        }
    } 
    
    static int factorialIterative(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }   

    public static void main(String[] args) {
        System.out.println("hello world!!!");
        System.out.println(factorialRecrusive(5));
        System.out.println(factorialIterative(5));
    }
}
