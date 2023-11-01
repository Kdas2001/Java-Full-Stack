import java.util.HashMap;
import java.util.Random;
import java.util.Map;


public class RandomHashMap {
    public static void main(String[] args) {
        Map<Integer, Double> RandomData = new HashMap<>();
        Random random = new Random(); //creating an instance of the Random cls
        for (int i = 0; i < 10; i++) {
            int randomKey = random.nextInt(100);  // Generating random integer key
            double randomValue = random.nextDouble()*100;  // Generating random double value
            // Multiplying it by 100 bcoz the values created are between 0.0 to 1.0
            RandomData.put(randomKey, randomValue);
        }
         int i=1;
        for (Map.Entry<Integer, Double> entry : RandomData.entrySet()) {
            int key = entry.getKey();
            double value = entry.getValue();
            System.out.println(i+". Key: " + key + ", Value: " + value);
            i++;
        }
    }
}

