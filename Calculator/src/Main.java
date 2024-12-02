import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Lire le premier nombre
            System.out.print("Entrez un Nombre : ");
            double nombre1 = sc.nextDouble();

            // Consommer le retour à la ligne
            sc.nextLine();

            // Lire l'opérateur
            System.out.print("Entrez un opérateur (+, -, *, /, %, add, subtract, multiply, divide, modulo) : ");
            String op = sc.nextLine();

            // Lire le deuxième nombre
            System.out.print("Entrez un deuxième Nombre : ");
            double nombre2 = sc.nextDouble();

            // Effectuer l'opération
            double result;
            if (op.equals("+") || op.equals("add")) {
                result = nombre1 + nombre2;
            } else if (op.equals("-") || op.equals("subtract")) {
                result = nombre1 - nombre2;
            } else if (op.equals("*") || op.equals("multiply")) {
                result = nombre1 * nombre2;
            } else if (op.equals("/") || op.equals("divide")) {
                if (nombre2 == 0) {
                    throw new ArithmeticException("Erreur : Division par zéro !");
                }
                result = nombre1 / nombre2;
            } else if (op.equals("%") || op.equals("modulo")) {
                if (nombre2 == 0) {
                    throw new ArithmeticException("Erreur : Modulo par zéro !");
                }
                result = nombre1 % nombre2;
            } else {
                throw new IllegalArgumentException("Opérateur invalide : " + op);
            }

            // Afficher le résultat
            System.out.println("Résultat : " + result);
        } catch (Exception e) {
            // Gérer les erreurs
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            // Fermer le scanner
            sc.close();
        }
    }
}
