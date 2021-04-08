import java.lang.reflect.Method;

public class Main {

    public static final int PROBLEM_TO_SOLVE = 4;

    public static void main(String[] args) {
        if(args.length == 0){
            solveProblem(PROBLEM_TO_SOLVE);
        }
        for(int i = 0; i < args.length; i++) {
            solveProblem(Integer.parseInt(args[i]));
        }

    }

    public static void solveProblem(int problemNumber) {
        System.out.printf("Solving problem: %d\nSolution: ", PROBLEM_TO_SOLVE);
        long startAt = System.currentTimeMillis();
        try {
            String className = String.format("problems.Problem%d", problemNumber);
            Method method = Class.forName(className).getDeclaredMethod("solve");
            method.invoke(Class.forName(className).newInstance());
        } catch (Exception e) {
            System.out.println("Error llamando a la clase o al método");
            e.printStackTrace();
        }
        long endAt = System.currentTimeMillis();
        System.out.println(String.format("Time taken: %d milis", endAt - startAt));
    }

}
