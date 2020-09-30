import operations.Operation;
import operations.SubstractOperation;
import operations.SumUpOperation;

import java.util.ArrayDeque;

public class InputInterpreter {

    private CalculationEngine engine;

    private ArrayDeque<Integer> memory;

    public InputInterpreter(CalculationEngine engine) {
        this.engine = engine;
        this.memory = new ArrayDeque<>();
    }

    public boolean interpret(String input) {
        try {
            engine.pushNumber(Integer.parseInt(input));
        } catch (Exception ex) {
            engine.pushOperation(this.getOperation(input));
        }
        return true;
    }

    public Operation getOperation(String operation) {

        switch (operation) {
            case "*":
                return new operations.MultiplicationOperation();
            case "/":
                return new operations.DivisibleOperation();
            case "+":
                return new SumUpOperation();
            case "-":
                return new SubstractOperation();
            case "ms":
                return new operations.MemorySaveOperation(this.memory);
            case "mr":
                return new operations.MemoryRecallOperation(this.memory);
        }

        return null;
    }
}
