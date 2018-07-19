import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int[] list = new int[100000];
        Random random = new Random();
        int rd = random.nextInt();
        for (int i = 0; i < list.length; i++) {
            list[i] = rd;
        }

    }
}
