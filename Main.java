public class Main {
    final static Integer a = 2;
    final static Integer b = 3;
    final static Float c = 2.5F;
    final static String OP = "suma";

    public static void main(String[] args) {
        Calcular calcula = new Calcular();

        if (OP == "suma") {
            System.out.println("La suma de " + a + " + " + b + " + " + c + " = " + calcula.suma(a, b, c));
        } else if (OP == "resta") {
            System.out.println("La suma de " + a + " - " + b + " = " + calcula.resta(a, b));
        } else if (OP == "division") {
            System.out.println("La suma de " + a + " / " + b + " = " + calcula.division(a, b));
        } else if (OP == "multiplicar") {
            System.out.println("La suma de " + a + " * " + b + " = " + calcula.multiplicar(a, b));
        }
    }
}