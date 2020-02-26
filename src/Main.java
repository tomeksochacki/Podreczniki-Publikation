public class Main {
    public static void main(String[] args) {

        //tworzenie obiektu publikacji
        Publication p = new Publication("Psy", "Dogs&Son", 2020, "ISBN2394", 200, 0);

        int n = 10; //kupimy 10 egzemplarzy
        p.buy(n);

        //liczmy koszy zakupów
        double koszt = n * p.getPrice();

        System.out.println("Na zakup " + n + " publikacji");
        System.out.println(p.getTitle());
        System.out.println(p.getIdent());
        System.out.println(p.getPublisher());
        System.out.println(p.getYear());
        System.out.println("----------- wydano: " + koszt);

        p.sell(4);
        System.out.println("Po sprzedaży zostało " + p.getQuantity() + " podreczników" );

    }
}
