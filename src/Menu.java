class Menu {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.component1 = new Component();
        drink1.component2 = new Component();
        drink1.component3 = new Component();

        drink1.name = "Błękitne orzeźwienie";
        drink1.price = 12.20;
        drink1.isAlcohol = true;
        drink1.component1.name = "wódka";
        drink1.component1.number = 50;

        drink1.component2.name = "likier blue curacao";
        drink1.component2.number = 50;

        drink1.component3.name = "Sprite";
        drink1.component3.number = 130;

        System.out.printf("Informacja o drinku: %s\n", drink1.name);
        System.out.printf("Skład: %s %.1fml, %s %.1fml, %s %.1fml\n", drink1.component1.name, drink1.component1.number,
                drink1.component2.name, drink1.component2.number, drink1.component3.name, drink1.component3.number);
        System.out.printf("Cena: %.2f\n", drink1.price);
        System.out.printf("Czy drink alkoholowy? %s\n", drink1.isAlcohol);
        double total = drink1.component1.number + drink1.component2.number + drink1.component3.number;
        System.out.println("Łączna pojemność: " + total + "ml.");
        System.out.print("\n");

//drugi drink
        Drink drink2 = new Drink();
        drink2.component1 = new Component();
        drink2.component2 = new Component();
        drink2.component3 = new Component();

        drink2.name = "Tropikalne orzeźwienie";
        drink2.price = 8.50;
        drink2.isAlcohol = false;

        drink2.component1.name = "Sok ananasowy";
        drink2.component1.number = 40;
        drink2.component2.name = "Sok grejpfrutowy";
        drink2.component2.number = 30;
        drink2.component3.name = "Jogurt naturalny";
        drink2.component3.number = 30;

        System.out.printf("Informacja o drinku: %s\n", drink2.name);
        System.out.printf("Skład: %s %.1fml, %s %.1fml, %s %.1fml\n", drink2.component1.name, drink2.component1.number,
                drink2.component2.name, drink2.component2.number, drink2.component3.name, drink2.component3.number);
        System.out.printf("Cena: %.2f\n", drink2.price);
        System.out.printf("Czy drink alkoholowy? %s\n", drink2.isAlcohol);

        total = drink2.component1.number + drink2.component2.number + drink2.component3.number;

        System.out.println("Łączna pojemność: " + total + "ml.");
    }
}
