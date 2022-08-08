import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[100];
        int largest = 0;
        Random rand = new Random();

        for (int i=0;i<100;++i)
            {
                array[i] = rand.nextInt(100);
                if (array[i] > largest)
                {
                    largest = array[i];
                }
              System.out.print(array[i] + " ");
            }
        System.out.println("\nThe largest integer in the array is " + largest);
    }
}
