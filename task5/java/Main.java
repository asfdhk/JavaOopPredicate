import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate pr = a-> {
            boolean n = true;
            int sum = 0;
            while (a != 0){
                  int digit = a%10;
                  sum +=digit;
                  a /=10;
            }
            if(sum % 2 !=0 ){
                  n = false;
            }
            return n;
        };
        int b = 123;
        System.out.println(pr.test(b));
    }
}
