package example.model;

public class Client {

    public static void main(String[] args) {

        Directeur directeur = new Directeur();

        MonteurPizzaReine reine = new MonteurPizzaReine();
        MonteurPizzaPiquante piquante = new MonteurPizzaPiquante();

        System.out.println("===== VERSION MODIFIEE =====");

        Pizza pizza1 = directeur.construire(reine);

        System.out.println("\n===== PIZZA REINE =====");
        System.out.println(pizza1);

        Pizza pizza2 = directeur.construire(piquante);

        System.out.println("\n===== PIZZA PIQUANTE =====");
        System.out.println(pizza2);

        System.out.println("\n===== TEST INDEPENDANCE =====");
        System.out.println("Deux pizzas distinctes : " + (pizza1 != pizza2));

        System.out.println("\n===== FIN DES TESTS =====");
    }
}