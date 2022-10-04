import java.util.Scanner;
public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int largestNumber = num1 > num2 ? num1 : num2;
        System.out.println("Get least common multiple : " + getLeastCommonMultiPle(num1, num2, largestNumber));

        System.out.println("Get least common multiple : " + getLeastCommonMultiPle(num1, num2, largestNumber));
    }

    public static int getLeastCommonMultiPle(int num1, int num2 , int largestNumber){
        if(largestNumber % num1 == 0 && largestNumber % num2 == 0)
            return largestNumber;

        return getLeastCommonMultiPle(num1, num2, ++largestNumber); 
    }

    // formula : num1 * num2 = gcd(num1, num2) * lcm(num1 * num2);

    public static int getLeastCommonMultiPle(int num1, int num2 ){
        return (num1 * num2) / GreatestCommonDivisorOfTwoNumbers.getGreatesCommonDivisorBetweenTwoAdv(num1, num2);
    }
}
