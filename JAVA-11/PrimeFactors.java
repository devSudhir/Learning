import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        //getAllPrimeFactors(number);
        printPrimeFactors(number);
    }

    public static void getAllPrimeFactors(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (i == 2 || i == 3) {
                    System.out.println("prime factor " + i);
                } else {
                    if (!(i % 2 == 0 || i % 3 == 0)) {
                        int leastDivisor = (int) Math.sqrt(i);
                        if (CheckPrime.checkPrimeAdv(i, leastDivisor, 5))
                            System.out.println("prime factor " + i);

                    }

                }
            }
        }
    }

    public static void printPrimeFactors(int n) {
        if (n <= 1)
            return;
        while (n % 2 == 0){
            System.out.println("prime factor 2");
            n /= 2;
        }
            
        while (n % 3 == 0){
            System.out.println("prime factor 3");
            n /= 3;
        }
           
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            while (n % (i + 2) == 0) {
                System.out.println((i + 2));
                n /= (i + 2);
            }
        }

        if(n > 3)
            System.out.println("prime factor " + n);
    }
}
