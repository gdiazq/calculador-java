import java.util.Scanner;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los números y la operación
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /, ^, sqrt, sin, cos, tan): ");
        String operacion = scanner.next();

        double resultado = 0;

        // Operaciones binarias (requieren dos números)
        if (operacion.equals("+") || operacion.equals("-") || operacion.equals("*") || operacion.equals("/") || operacion.equals("^")) {
            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            switch (operacion) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case "^": // Potencia
                    resultado = Math.pow(numero1, numero2);
                    break;
                default:
                    System.out.println("Operación no válida.");
                    break;
            }
        } 
        // Operaciones unarias (requieren un solo número)
        else {
            switch (operacion) {
                case "sqrt": // Raíz cuadrada
                    resultado = Math.sqrt(numero1);
                    break;
                case "sin": // Seno
                    resultado = Math.sin(Math.toRadians(numero1));
                    break;
                case "cos": // Coseno
                    resultado = Math.cos(Math.toRadians(numero1));
                    break;
                case "tan": // Tangente
                    resultado = Math.tan(Math.toRadians(numero1));
                    break;
                default:
                    System.out.println("Operación no válida.");
                    break;
            }
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}