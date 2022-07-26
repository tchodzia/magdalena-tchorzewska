package inner.classes;

public class EquationClass implements Equation {


    @Override
    public int execute(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        EquationClass equation = new EquationClass() {
            @Override
            public int execute(int a, int b) {
                return a+b;
            }
        };
        System.out.println(equation.execute(a,b));

        EquationClass difference = new EquationClass() {
            @Override
            public int execute(int a, int b) {
                return a-b;
            }
        };
        System.out.println(difference.execute(a,b));

    }
}
