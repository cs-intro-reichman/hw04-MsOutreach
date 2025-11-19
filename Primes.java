public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // You can change this value to test with different inputs
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (count*100/n) + "% are primes)");
    }
    /** Returns true if the given number is prime, false otherwise. */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        // Replace this statement with your code
    }
}