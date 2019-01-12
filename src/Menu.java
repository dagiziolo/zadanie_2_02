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
        System.out.print("Łączna pojemność: " + total + "ml.");


    }
}
