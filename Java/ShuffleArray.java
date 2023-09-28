// A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        shuffleArray(originalArray);

        System.out.println("Shuffled Array: " + Arrays.toString(originalArray));
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
        
            int j = random.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}

/*
        METHOD 2
        Integer[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        List<Integer> list = Arrays.asList(originalArray);
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));

    */    