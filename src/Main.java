public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1",20);
        Item item2 = new Item("2",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "password"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Ana Moise", "123456789", "1010", "12/20"));
    }
}
