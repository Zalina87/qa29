import java.lang.module.FindException;

public class BmiService {
    public int calculate(int weight, double height) {

        double powHeight = Math.pow(height, 2);
// weight - вес, height - рост
        int index = (int) (weight / powHeight);

        return index;
    }
}
