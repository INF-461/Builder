package example.model;

public class Directeur {

    public Pizza construire(MonteurPizza monteur) {

        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();

        return monteur.getPizza();
    }
}