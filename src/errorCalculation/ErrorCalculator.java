package errorCalculation;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

class ErrorCalculator {
    private List<Integer> expected;
    private List<Integer> actual;

    ErrorCalculator(List<Integer> expected, List<Integer> actual){
        this.expected = expected;
        this.actual = actual;
    }

    void calculate(NormType type){
        if (expected.size() != actual.size()) {
            System.out.print("Sizes of arrays differ");
            return;
        }
        ArrayList<Integer> diff = new ArrayList<Integer>(actual.size());
        for (int i = 0; i < actual.size(); i++){
            diff.add(abs(actual.get(i) - expected.get(i)));
        }
        System.out.println("The relative error is "+type.getNorm(diff)/type.getNorm(actual)+ " using the "+type.getType()+ " norm");

    }
}
