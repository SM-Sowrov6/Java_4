import java.util.Scanner;

public class PrimeNumber {
   public PrimeNumber() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      if (isPrime(var2)) {
         System.out.println("" + var2 + " is a prime number.");
      } else {
         System.out.println("" + var2 + " is not a prime number.");
      }

   }

   public static boolean isPrime(int var0) {
      for(int var1 = 2; var1 <= var0 / 2; ++var1) {
         if (var0 % var1 == 0) {
            return false;
         }
      }

      return true;
   }
}