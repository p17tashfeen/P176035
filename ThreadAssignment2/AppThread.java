public class AppThread {
    public static void main(String[] args) throws Exception {
        EvenNumbers countEven = new EvenNumbers();
        PrimeNumbers countPrime = new PrimeNumbers();

        countEven.setName("Thread for counting Even number");
        countPrime.setName("Thread for counting Prime numbers ");

        countEven.start();
        countPrime.start();
    }
}