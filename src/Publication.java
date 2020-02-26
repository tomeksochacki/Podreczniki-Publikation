public class Publication {

private String title;
private String publisher;
private int year;
private String ident;
private double price;
private int quantity;
private int n;

public Publication (String t, String pb, int y, String i, double pr, int q){
    title = t;
    publisher = pb;
    year = y;
    ident = i;
    price = pr;
    quantity = q;
}
    public void sell(int n) {
        quantity -= n;
    }

    public void buy(int n){
    quantity += n;
    }
    public String getTitle(){
        return title;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getYear(){
        return year;
    }
    public String getIdent(){
        return ident;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

}


