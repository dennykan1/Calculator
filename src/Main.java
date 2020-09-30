import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        CalculationEngine engine = new CalculationEngine();
        InputInterpreter interpreter = Extensions.buildInterpreter(engine);
        String[] tokens = read.readLine().split("\\s+");

        for (String token : tokens) {
            if(token.equals("Enter")){
                break;
            }
            interpreter.interpret(token);
        }


        System.out.println(engine.getCurrentResult());
    }
}
