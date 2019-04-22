package payingStrategy;

public class Item {

    private String ID;
    private int price;

    public Item(String id, int cost){
        this.ID = id;
        this.price=cost;
    }

    public String getID() {
        return ID;
    }

    public int getPrice() {
        return price;
    }

}
