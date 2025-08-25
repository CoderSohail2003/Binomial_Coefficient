import java.util.*;
public class Bino_Coefficient{


    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f; //factorial of n
    }

        public static int coeff(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int result = a / (b * c);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int total = coeff(n, r);
        System.out.println(total);
        sc.close();
              
        
    }
}