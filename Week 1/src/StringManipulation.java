import java.util.Scanner; // Importation de la classe Scanner pour lire les entrées utilisateur

public class StringManipulation {

    // Méthode pour inverser une chaîne
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner pour lire les entrées utilisateur

        System.out.println("Enter a string to reverse: "); // Invite l'utilisateur à entrer une chaîne
        String original = scanner.nextLine(); // Lit la chaîne entrée par l'utilisateur

        String reversed = reverse(original); // Appelle la méthode reverse pour inverser la chaîne

        System.out.println("Original: " + original); // Affiche la chaîne originale
        System.out.println("Reversed: " + reversed); // Affiche la chaîne inversée

        scanner.close(); // Ferme le scanner pour libérer les ressources
    }
}
