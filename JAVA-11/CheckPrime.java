import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if (number == 1 || number % 2 == 0 || number % 3 == 0)
            System.out.println("Is " + number + " prime? : " + false);
        else {
            int leastDivisor = (int) Math.sqrt(number);
            System.out.println("Is " + number + " prime? : " + checkPrime(number, leastDivisor));
            System.out.println("Is " + number + " prime? : " + checkPrimeAdv(number, leastDivisor, 5));
        }

    }

    public static boolean checkPrime(int number, int leastDivisor) {
        if (leastDivisor == 1)
            return true;
        if (number % leastDivisor == 0)
            return false;
        return checkPrime(number, --leastDivisor);
    }

    public static boolean checkPrimeAdv(int number, int leastDivisor, int start) {
        if (leastDivisor  >= start ){
            if (number % start == 0 || number % (start + 2) == 0) 
                return false;
        } else {
            return true;
        }
        
        return checkPrimeAdv(number, leastDivisor, start + 6);
    }
}
