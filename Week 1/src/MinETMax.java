import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinETMax {

    // Méthode pour trouver le maximum dans une liste
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0); // Initialiser max avec le premier élément de la liste
        for (int number : numbers) { // Parcourir chaque nombre dans la liste
            if (number > max) { // Si le nombre courant est plus grand que max
                max = number; // Mettre à jour max avec ce nombre
            }
        }
        return max; // Retourner la valeur maximale trouvée
    }

    // Méthode pour trouver le minimum dans une liste
    public static int findMin(List<Integer> numbers) {
        int min = numbers.get(0); // Initialiser min avec le premier élément de la liste
        for (int number : numbers) { // Parcourir chaque nombre dans la liste
            if (number < min) { // Si le nombre courant est plus petit que min
                min = number; // Mettre à jour min avec ce nombre
            }
        }
        return min; // Retourner la valeur minimale trouvée
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner pour lire les entrées utilisateur
        List<Integer> numbers = new ArrayList<>(); // Création d'une liste pour stocker les nombres entrés par l'utilisateur

        System.out.println("Enter numbers one by one, pressing Enter after each. Type 'done' to finish:"); // Invite l'utilisateur à entrer des nombres
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) { // Vérifie si l'entrée suivante est un entier
                numbers.add(scanner.nextInt()); // Ajoute le nombre entré à la liste
            } else {
                String input = scanner.next(); // Lit l'entrée suivante comme chaîne
                if (input.equalsIgnoreCase("done")) { // Si l'utilisateur tape 'done'
                    break; // Arrête la boucle
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish."); // Message d'erreur pour une entrée invalide
                }
            }
        }

        if (!numbers.isEmpty()) { // Vérifie si la liste n'est pas vide
            int max = findMax(numbers); // Appelle la méthode findMax pour trouver le maximum
            int min = findMin(numbers); // Appelle la méthode findMin pour trouver le minimum
            System.out.println("Original List: " + numbers); // Affiche la liste originale
            System.out.println("Maximum: " + max); // Affiche le nombre maximum
            System.out.println("Minimum: " + min); // Affiche le nombre minimum
        } else {
            System.out.println("No numbers entered."); // Message si aucun nombre n'a été entré
        }

        scanner.close(); // Ferme le scanner pour libérer les ressources
    }
}
