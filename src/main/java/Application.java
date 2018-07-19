import java.util.Random;

public class Application {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] list = new int[100000];
        Random random = new Random();
        int rd = random.nextInt();
        for (int i = 0; i < list.length; i++) {
            list[i] = rd;
        }
        System.out.println("Process start at " + stopWatch.start());
        Sort.selectionSort(list);
        System.out.println("End process at: " + stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());

    }
}
