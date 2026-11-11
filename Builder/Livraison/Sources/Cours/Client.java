package example.model;

public class Client {

    public static void main(String[] args) {

        Directeur directeur = new Directeur();

        System.out.println("===== PIZZA REINE FABRIQUEE =====");
        directeur.construirePizzaReine().print();

        System.out.println("\n===== PIZZA PIQUANTE FABRIQUEE =====");
        directeur.construirePizzaPiquante().print();

        System.out.println("\n===== FIN DES TESTS =====");
    }
}