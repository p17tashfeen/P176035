public class PrimeNumbers extends Thread{
    
    public boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
    
    @Override
    public void run() {
        int counter = 0;

        for (int i = 1; i <= 10000; i++) {
            if(isPrime(i)) {
                counter += 1;
            }
        }

        System.out.println("Total Prime numbers in thread   :" + counter);
    }
}
