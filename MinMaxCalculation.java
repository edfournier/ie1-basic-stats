import java.util.List;

public class MinMaxCalculation {
    public double[] calculateMinMax(List<Double> numbers) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new double[] {min, max};
    }
}
