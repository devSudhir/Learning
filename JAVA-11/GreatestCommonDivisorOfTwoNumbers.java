import java.util.Scanner;

class GreatestCommonDivisorOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        sc.close();

        //NORMAL Flow
        int smallestNumber = num1 > num2 ? num2 : num1;
        int bigestNumber = num1 > num2 ? num1 : num2;

        if (bigestNumber % smallestNumber == 0)
        System.out.println("Greatest Common Divisor : " + smallestNumber);
        else {
        int greatestCommonDivisorSearhingStartsFrom = smallestNumber / 2;
        System.out.println("Greatest Common Divisor : " +
        getGreatesCommonDivisorBetweenTwo(num1, num2,
        greatestCommonDivisorSearhingStartsFrom));
        }

        //EUCLID - BASIC
        System.out.println("Greatest Common Divisor : " + getGreatesCommonDivisorBetweenTwo(num1, num2));

        //EUCLID ADV.
        System.out.println("Greatest Common Divisor : " + getGreatesCommonDivisorBetweenTwoAdv(num1, num2));
        
        
    }

    public static int getGreatesCommonDivisorBetweenTwo(int num1, int num2,
            int greatestCommonDivisorSearhingStartsFrom) {
        if (greatestCommonDivisorSearhingStartsFrom == 1)
            return 1;
        if (num1 % greatestCommonDivisorSearhingStartsFrom == 0
                && num2 % greatestCommonDivisorSearhingStartsFrom == 0) {
            return greatestCommonDivisorSearhingStartsFrom;
        }
        return getGreatesCommonDivisorBetweenTwo(num1, num2, --greatestCommonDivisorSearhingStartsFrom);
    }

    // EUCLID ALGO - basic
    public static int getGreatesCommonDivisorBetweenTwo(int num1, int num2) {
        if (num1 == num2)
            return num1;
        return num1 > num2 ? getGreatesCommonDivisorBetweenTwo(num1 - num2, num2)
                : getGreatesCommonDivisorBetweenTwo(num1, num2 - num1);
    }

    // EUCLID ALGO - Advanced
    public static int getGreatesCommonDivisorBetweenTwoAdv(int num1, int num2) {
        if (num2 == 0)
            return num1;

        return getGreatesCommonDivisorBetweenTwo(num2, num1 % num2);

    }
}