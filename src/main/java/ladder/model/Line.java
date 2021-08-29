package ladder.model;

import java.util.List;

public class Line {

    private static final String LINE_OVERLAPPED_MSG = "라인은 겹치면 안됩니다.";

    public static void of(List<Boolean> steps) {
        validateStep(steps);
    }

    private static void validateStep(List<Boolean> steps) {
        for (int i = 0; i < steps.size() - 1; i++) {
            isOverLapped(steps.get(i), steps.get(i+1));
        }
    }

    private static void isOverLapped(Boolean firstStep, Boolean secondStep) {
        if(firstStep && secondStep){
            throw new IllegalArgumentException(LINE_OVERLAPPED_MSG);
        }
    }
}
