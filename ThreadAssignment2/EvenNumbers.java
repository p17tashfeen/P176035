public class EvenNumbers extends Thread{
    @Override
    public void run() {
        int counter = 0;

        for(int i = 1; i <= 10000; i++){
            if(i % 2 == 0) {
                counter += 1;
            }
        }

        System.out.println("Total Even Numbers in thread   :" + counter);
    }
}