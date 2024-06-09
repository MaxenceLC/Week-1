import java.util.Scanner; // Importation de la classe Scanner pour lire les entrées utilisateur

public class Calculator {

    // Méthode pour additionner deux nombres
    public static double add(double a, double b) {
        return a + b;
    }

    // Méthode pour soustraire deux nombres
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Méthode pour multiplier deux nombres
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Méthode pour diviser deux nombres
    public static double divide(double a, double b) {
        if (b == 0) { // Vérifie si le diviseur est zéro pour éviter la division par zéro
            throw new IllegalArgumentException("Cannot divide by zero."); // Lève une exception si b est zéro
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner pour lire les entrées utilisateur

        System.out.println("Enter first number: "); // Invite l'utilisateur à entrer le premier nombre
        double num1 = scanner.nextDouble(); // Lit le premier nombre entré par l'utilisateur

        System.out.println("Enter second number: "); // Invite l'utilisateur à entrer le second nombre
        double num2 = scanner.nextDouble(); // Lit le second nombre entré par l'utilisateur

        System.out.println("Choose an operation (+, -, *, /): "); // Demande à l'utilisateur de choisir une opération
        char operation = scanner.next().charAt(0); // Lit le caractère représentant l'opération

        double result; // Variable pour stocker le résultat du calcul
        switch (operation) { // Utilise un switch pour déterminer l'opération à effectuer
            case '+':
                result = add(num1, num2); // Appelle la méthode add pour additionner les deux nombres
                break;
            case '-':
                result = subtract(num1, num2); // Appelle la méthode subtract pour soustraire les deux nombres
                break;
            case '*':
                result = multiply(num1, num2); // Appelle la méthode multiply pour multiplier les deux nombres
                break;
            case '/':
                result = divide(num1, num2); // Appelle la méthode divide pour diviser les deux nombres
                break;
            default:
                throw new IllegalArgumentException("Invalid operation"); // Lève une exception si l'opération est invalide
        }

        System.out.println("The result is: " + result); // Affiche le résultat du calcul
        scanner.close(); // Ferme le scanner pour libérer les ressources
    }
}
