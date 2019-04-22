package errorCalculation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> expected = Arrays.asList(6, 6, 2, 6);
        List<Integer> actual = Arrays.asList(6, 1, 2, 6);

        ErrorCalculator errCalc = new ErrorCalculator(expected, actual);
        errCalc.calculate(new EuclideanNorm());
        errCalc.calculate(new ManhattanNorm());
    }


}
