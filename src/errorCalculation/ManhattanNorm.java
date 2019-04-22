package errorCalculation;
import java.util.List;

public class ManhattanNorm implements NormType {
    @Override
    public double getNorm(List<Integer> array) {
        return array.stream().mapToDouble(Math::abs).sum();
    }

    @Override
    public String getType() {
        return "Manhattan";
    }
}
