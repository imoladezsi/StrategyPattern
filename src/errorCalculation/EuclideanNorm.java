package errorCalculation;
import java.util.List;
import static java.lang.Math.*;


public class EuclideanNorm implements NormType {
    @Override
    public double getNorm(List<Integer> array) {
        return sqrt(array.stream().mapToDouble(x->pow(x,2)).sum());
    }

    @Override
    public String getType() {
        return "Euclidean";
    }
}
