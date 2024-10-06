public class Main {
    public static void main(String[] args) {
        double[] objectiveCoefficients = {5.0, 4.0};
        boolean maximize = true;

        // can create an initial LP with objective function and maximize type
        LinearProgram lp = new LinearProgram(objectiveCoefficients, maximize);

        // creating and adding constraints like this
        lp.add("leq", 11.0, 3.0, 1.0);

        lp.add("leq", 9.0, 1.0, 2.0);

        lp.add("leq", 57.0, 13.0, 7.0);


        // try displaying the original problem + augmented form tableau
        // everything should work exactly as expected
        lp.display();
        System.out.println();
        System.out.println("AUGMENTED FORM");
        lp.displayAugmentedForm();

        lp.solve();
    }
}
