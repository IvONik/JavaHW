
    import java.util.Scanner;
public class HW1 {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Введите число : ");
            int n = Scanner.nextInt();
            Scanner.close();
            System.out.println( treangleNumber(n));
            
        }

        public static int treangleNumber (int n){
            int treangleNumber = (n*(n+1))/2;
            return treangleNumber;
        }
    }